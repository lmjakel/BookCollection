package com.leeannjakel.controller;

import com.leeannjakel.entity.*;
import com.leeannjakel.persistence.ApiDao;
import com.leeannjakel.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FindBook  extends HttpServlet {
        private final Logger logger = LogManager.getLogger(this.getClass());

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            GenericDao userDao = new GenericDao(User.class);
            GenericDao authorDao = new GenericDao(Author.class);
            GenericDao genreDao = new GenericDao(Genre.class);
            GenericDao booksDao = new GenericDao(Book.class);
            ApiDao apiDao = new ApiDao();

            //Get book info from API
            String isbn = req.getParameter("isbn");
            String title = apiDao.getBook(isbn).getTitle();

            //get author name
            List<AuthorsItem> authorList = apiDao.getBook(isbn).getAuthors();
            String key = authorList.get(0).getKey();
            String authorName = apiDao.getAuthor(key);


            //Create array of book attributes
            List<String[]> book = new ArrayList<>();
            String[] bookItem = {isbn, title, authorName};
            book.add(bookItem);


            req.setAttribute("books", book);

            RequestDispatcher dispatcher = req.getRequestDispatcher("/bookFound.jsp");
            dispatcher.forward(req, resp);
        }
    }