package com.leeannjakel.controller;

import com.leeannjakel.entity.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.leeannjakel.persistence.ApiDao;
import com.leeannjakel.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * The type Add book.
 */
@WebServlet(
        urlPatterns = {"/AddBook"}
)

public class AddBook extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Instantiate the Daos
     */
    GenericDao<User> userDao = new GenericDao(User.class);
    GenericDao<Author> authorDao = new GenericDao(Author.class);
    GenericDao<Genre> genreDao = new GenericDao(Genre.class);
    GenericDao<Book> bookDao = new GenericDao(Book.class);


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
        Info bookInfo = apiDao.getBook(isbn);
        String title = bookInfo.getTitle();

        //get author name
        List<WorksItem> authorList = apiDao.getBook(isbn).getWorks();
        String key = authorList.get(0).getKey();
        String authorName = apiDao.getWorks(key);
        Author bookAuthor = null;
        /**determine if author already exists
         * if so, get Author. If not, add author
         */
        List<Author> allAuthorsList = authorDao.getAll();
        boolean found = false;
        for (Author author: allAuthorsList) {
            String authorListName = author.getName();
            if (authorListName.equals(authorName)) {
                List<Author> bookAuthorList = authorDao.getByPropertyEqual("name", authorListName);
                bookAuthor = bookAuthorList.get(0);
                found = true;
            }
        }
        if (!found) {
            Author newAuthor = new Author(authorName);
            int id = authorDao.insert(newAuthor);
            bookAuthor = authorDao.getById(id);
        }
        //Set Genre to 1 for time being and notes to null
        Genre genre = genreDao.getById(1);
        String notes = "";

        //set Book attributes
        Book newBook = new Book();
        newBook.setTitle(title);
        newBook.setIsbn(isbn);
        newBook.setNotes(notes);
        newBook.setGenre(genre);
        newBook.setAuthor(bookAuthor);
        newBook.setUser(user);

        //insert book to database
        bookDao.insert(newBook);

        req.setAttribute("books", newBook);

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
        //get book ID from form
        String idString =  req.getParameter("bookId");
        int bookId = Integer.parseInt(idString);
        logger.debug("BookId: {}", bookId);

        //Get book to update
        Book bookToUpdate = bookDao.getById(bookId);
        logger.debug("Book: {}", bookToUpdate);

        //get info from form and set in bookToUpdate
        String genre = req.getParameter("genre");
        List<Genre> genreList = genreDao.getByPropertyEqual("name", genre);
        Genre genreItem = genreList.get(0);
        bookToUpdate.setGenre(genreItem);

        String notes = req.getParameter("notes");
        bookToUpdate.setNotes(notes);


        //update book
        bookDao.update(bookToUpdate);
        Book retrievedBook = bookDao.getById(bookId);

        req.setAttribute("books", retrievedBook);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/addSuccessful.jsp");
        dispatcher.forward(req, resp);
    }
}
