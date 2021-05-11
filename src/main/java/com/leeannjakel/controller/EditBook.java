package com.leeannjakel.controller;

import com.leeannjakel.entity.Book;
import com.leeannjakel.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(
        urlPatterns = {"/EditBook"}
)
/**
 * class edits book entry
 * @author LeeAnn Jakel
 */
public class EditBook extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Book dao.
     */
    GenericDao<Book> bookDao = new GenericDao(Book.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idString = req.getParameter("bookId");
        int idInt = Integer.parseInt(idString);

        Book bookToEdit = bookDao.getById(idInt);
        req.setAttribute("book", bookToEdit);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/verifyEdit.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException {
        String output = "";

        String idString =  req.getParameter("bookId");
        int bookId = Integer.parseInt(idString);
        logger.debug("book ID: {}", bookId);

        if (req.getParameter("submit") != null){
            Book bookToUpdate = bookDao.getById(bookId);
            bookToUpdate.setNotes(req.getParameter("notes"));

            bookDao.update(bookToUpdate);
            output = "Yippee! Your book has been updated!";
        } else {
            output = "Unfortunately, your book has not been updated.";
        }
        req.setAttribute("output", output);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/confirmModification.jsp");
        dispatcher.forward(req, resp);

    }
}

