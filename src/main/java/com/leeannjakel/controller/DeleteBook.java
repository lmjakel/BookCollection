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
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Modify a book.
 */
@Path("/ModifyBook")
/**
 * A class used to delete a character as passed in from the view character page
 *
 * @author LeeAnn Jakel
 */
public class DeleteBook extends HttpServlet{
    private final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao<Book> bookDao = new GenericDao(Book.class);

    @GET
    @Path("/DeleteVerification/{book}")
    @Produces({"text/html"})
    public void deleteBookVerification(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idString = req.getParameter("book");
        int idInt = Integer.parseInt(idString);

        List<Book> book = bookDao.getByPropertyEqualsId("id", idInt);

        req.setAttribute("book", book);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/verifyDelete.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException {
        String id =  req.getParameter("bookId");
        int bookId = Integer.parseInt(id);

        if (req.getParameter("type").equals("delete")) {
           deleteBook(bookId);

        } else {
            noDeleteBook(bookId);
        }
    }

    @GET
    @Path("/Delete/{book}")
    @Produces({"text/html"})
    public Response deleteBook(int bookId){
        Book book = bookDao.getById(bookId);

        bookDao.delete(book);
        String output = "<h2>Book has been deleted</h2>"
                + "<a href=''>Return to homepage</a>";

        return Response.status(200).entity(output).build();

    }

    @GET
    @Path("/NoDelete/{book}")
    @Produces({"text/html"})
    public Response noDeleteBook(int bookId){

        String output = "<h2>Book has not been deleted</h2>"
                + "<a href=''>Return to homepage</a>";

        return Response.status(200).entity(output).build();

    }
}
