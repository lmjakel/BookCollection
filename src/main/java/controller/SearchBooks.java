package controller;

import entity.Book;
import entity.Info;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        urlPatterns = {"/searchBooks"}
)

public class SearchBooks extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDao<Book> dao = new GenericDao(Book.class);

        logger.debug("searchBooks class");

        if (req.getParameter ("submit").equals("search")) {
            logger.debug("inside the if");
            List<Book> book = dao.getByPropertyLike("title", req.getParameter("searchTerm"));
            req.setAttribute("book", book);
        } else {
            req.setAttribute("book", dao.getAll());
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }
}
