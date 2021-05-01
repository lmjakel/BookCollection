package com.leeannjakel.controller;

import com.leeannjakel.entity.Author;
import com.leeannjakel.entity.Book;
import com.leeannjakel.entity.Genre;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.leeannjakel.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
        urlPatterns = {"/DeleteBook"}
)
/**
 * A class used to delete a character as passed in from the view character page
 *
 * @author LeeAnn Jakel
 */
public class DeleteBook extends HttpServlet{
    private final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao<Book> bookDao = new GenericDao(Book.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.debug("I am in delete book doGet");
        String idString = req.getParameter("bookId");
        int idInt = Integer.parseInt(idString);

        List<Book> book = bookDao.getByPropertyEqualsId("id", idInt);

        req.setAttribute("book", book);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/verifyDelete.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String output = "";

        String idString =  req.getParameter("bookId");
        int bookId = Integer.parseInt(idString);
        logger.debug("book ID: {}", bookId);

        if (req.getParameter("submit").equals("delete")){
            logger.debug("I am in delete book");

            Book book = bookDao.getById(bookId);

            bookDao.delete(book);
            output = "Book has been deleted";
        } else {
            logger.debug("I am in no delete book");

            output = "Book has not been deleted";
        }
        req.setAttribute("output", output);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/confirmDelete.jsp");
        dispatcher.forward(req, resp);

    }
}
