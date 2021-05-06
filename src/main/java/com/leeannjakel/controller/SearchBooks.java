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
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


/**
 * The type Search books.
 */
@WebServlet(
        urlPatterns = {"/SearchBooks"}
)
/**
 * class allows user to search for a book
 * @author LeeAnn Jakel
 */
public class SearchBooks extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getUserPrincipal().getName();

        GenericDao<Book> dao = new GenericDao(Book.class);
        GenericDao<Author> authorDao = new GenericDao(Author.class);
        GenericDao<Genre> genreDao = new GenericDao(Genre.class);

        List<Book> book = new ArrayList<>();

        if (req.getParameter("type").equals("viewAll")) {
            req.setAttribute("book", dao.getAll());
        } else {
            String searchType = req.getParameter("type");
            logger.debug("search type: {}", searchType);
            String searchTerm = req.getParameter("searchTerm");
            logger.debug("search term: {}", searchTerm);

            if (searchType.equals("author")) {
                List<Author> authorList = authorDao.getByPropertyLike("name", searchTerm);
                logger.debug("authorList: {}", authorList);

                for (Author author : authorList) {
                    List<Book> authorBooks = dao.getByPropertyEqualsId("author", author.getId());
                    logger.debug("author books: {}", authorBooks);

                    for (Book books : authorBooks) {
                        book.add(books);
                    }
                    logger.debug("Book list: {}", book);
                }
            } else if (searchType.equals("genre")) {
                List<Genre> genreList = genreDao.getByPropertyLike("name", searchTerm);
                logger.debug("genreList: {}", genreList);

                for (Genre genre : genreList) {
                    List<Book> genreBooks = dao.getByPropertyEqualsId("genre", genre.getId());
                    logger.debug("genre books: {}", genreBooks);

                    for (Book books : genreBooks) {
                        book.add(books);
                    }
                    logger.debug("Book list: {}", book);
                }
            } else if (searchType.equals("title")) {

                book = dao.getByPropertyEqual("title", searchTerm);
                logger.debug("Title books: {}", book);

            }
            req.setAttribute("book", book);
        }

            RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
            dispatcher.forward(req, resp);
        }
    }
