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
        urlPatterns = {"/AddBookManually"}
)
/**
 * class adds new book to database
 * @author LeeAnn Jakel
 */
public class AddBookManually extends HttpServlet{

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

        //Get book info from form
        String title = req.getParameter("title");
        String authorName = req.getParameter("author");
        String genreName = req.getParameter("genre");
        String notes = req.getParameter("notes");
        String isbn = req.getParameter("isbn");


        /**determine if author already exists
         * if so, get Author. If not, add author
         */
        Author bookAuthor = null;
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

        Genre genre = genreDao.getByPropertyEqual("name", genreName).get(0);

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

        RequestDispatcher dispatcher = req.getRequestDispatcher("/addSuccessful.jsp");
        dispatcher.forward(req, resp);
    }
}
