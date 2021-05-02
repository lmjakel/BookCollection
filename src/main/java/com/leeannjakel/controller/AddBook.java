package com.leeannjakel.controller;

import com.leeannjakel.entity.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.leeannjakel.persistence.ApiDao;
import com.leeannjakel.persistence.GenericDao;
import com.fasterxml.jackson.core.JsonProcessingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Add book.
 */
@WebServlet(
        urlPatterns = {"/addBook"}
)

public class AddBook extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Instantiate the Daos
     */
    GenericDao userDao = new GenericDao(User.class);
    GenericDao authorDao = new GenericDao(Author.class);
    GenericDao genreDao = new GenericDao(Genre.class);
    GenericDao bookDao = new GenericDao(Book.class);


    /**
     * doGet() used to find if book is in API database and add to database
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApiDao apiDao = new ApiDao();

        //get username
        String username = req.getUserPrincipal().getName();
        List<User> users = userDao.getByPropertyEqual("userName", username);
        User user = users.get(0);
        int userID = users.get(0).getId();

        //Get book info from API
        String isbn = req.getParameter("isbn");
        logger.debug("isbn: {}", isbn);

        Info bookInfo = apiDao.getBook(isbn);
        logger.debug("Book: {}", bookInfo);

        String title = bookInfo.getTitle();
        logger.debug("book Title: {}", title);

        //get author name
        List<AuthorsItem> authorList = apiDao.getBook(isbn).getAuthors();
        String key = authorList.get(0).getKey();
        String authorName = apiDao.getAuthor(key);
        Author author = new Author(authorName);

        //Set Genre and notes to null
        Genre genre = new Genre("");
        String notes = "";

        //Create array of book attributes
        List<Book> book = new ArrayList<>();

        Book bookItem = new Book(title, isbn, author, user, genre, notes);
        book.add(bookItem);


        req.setAttribute("books", book);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/bookFound.jsp");
        dispatcher.forward(req, resp);
    }

    /**
     * doPost() used to edit genre and notes
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idString =  req.getParameter("bookId");
        int bookId = Integer.parseInt(idString);

        //get info from form
        String genre = req.getParameter("genre");
        Genre genreName = (Genre) genreDao.getByPropertyEqual("name", genre);
        String notes = req.getParameter("notes");

        //Create array of book attributes
        Book bookToUpdate = (Book) bookDao.getById(bookId);
        bookToUpdate.setNotes(notes);
        bookToUpdate.setGenre(genreName);

        bookDao.update(bookToUpdate);
        //Add to tables
        Book newBook = new Book();
        logger.debug("Added book: {}", newBook);


        int id = bookDao.insert(newBook);

        req.setAttribute("books", newBook);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/bookFound.jsp");
        dispatcher.forward(req, resp);
    }
}
