package com.leeannjakel.controller;


import com.leeannjakel.entity.Author;
import com.leeannjakel.entity.Book;
import com.leeannjakel.entity.Genre;
import com.leeannjakel.entity.User;
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

@WebServlet(
        urlPatterns = {"/addBook"}
)

public class AddBook extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao userDao = new GenericDao(User.class);
        GenericDao authorDao = new GenericDao(Author.class);
        GenericDao genreDao = new GenericDao(Genre.class);
        GenericDao booksDao = new GenericDao(Book.class);
        ApiDao apiDao = new ApiDao();

        //Reference for getting j_username from login page
        // https://stackoverflow.com/questions/10723138/where-can-i-find-j-security-check
        String username = req.getUserPrincipal().getName();
        List<User> users = userDao.getByPropertyEqual("userName", username);
        int userID = users.get(0).getId();

        //Get book info from API



        //instantiate classes
        User user = (User) userDao.getById(userID);
        Book book = new Book();
        Author author = new Author();
        Genre genre = new Genre();

        //Add to tables
        Book newBook = new Book();
        user.addBook(newBook);
        logger.debug("Added book: {}", newBook);


        int id = booksDao.insert(newBook);

        req.setAttribute("books", booksDao.getByPropertyEqual("userName", username));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/bookFound.jsp");
        dispatcher.forward(req, resp);
    }
}
