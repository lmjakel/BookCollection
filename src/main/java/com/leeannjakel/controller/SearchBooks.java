package com.leeannjakel.controller;

import com.leeannjakel.entity.Author;
import com.leeannjakel.entity.Book;
import com.leeannjakel.entity.Genre;
import com.leeannjakel.entity.User;
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
    GenericDao<Book> dao = new GenericDao(Book.class);
    GenericDao<Author> authorDao = new GenericDao(Author.class);
    GenericDao<Genre> genreDao = new GenericDao(Genre.class);
    GenericDao<User> userDao = new GenericDao(User.class);
    List<Book> searchResults = new ArrayList<Book>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getUserPrincipal().getName();
        List<User> users = userDao.getByPropertyEqual("userName", username);
        int userId = users.get(0).getId();

        String searchType = req.getParameter("type");
        String searchTerm = req.getParameter("searchTerm");

        searchResults = getUser(searchType, searchTerm, userId);

        req.setAttribute("book", searchResults);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
        }

        public List<Book> getUser (String searchType, String searchTerm, int userId) {
            List<Book> bookList = dao.getByPropertyEqualsId("user", userId);
            logger.debug("current user book list: {}", bookList);

            if (searchType.equals("viewAll")) {
                searchResults = bookList;
            } else {
                logger.debug("search type: {}", searchType);
                logger.debug("search term: {}", searchTerm);

                if (searchType.equals("author")) {
                    logger.debug("Search results before getAuthor: {}", searchResults);

                    searchResults = getByAuthor(bookList, searchTerm);
                    logger.debug("Search results after: {}", searchResults);


                } else if (searchType.equals("genre")) {
                    List<Genre> genreList = genreDao.getByPropertyLike("name", searchTerm);
                    logger.debug("genreList: {}", genreList);

                    for (Genre genre : genreList) {
                        List<Book> genreBooks = dao.getByPropertyEqualsId("genre", genre.getId());
                        logger.debug("genre books: {}", genreBooks);

                        for (Book books : genreBooks) {
                            searchResults.add(books);
                        }
                        logger.debug("Book list: {}", searchResults);
                    }
                } else if (searchType.equals("title")) {

                    searchResults = dao.getByPropertyEqual("title", searchTerm);
                    logger.debug("Title books: {}", searchResults);

                }
            }
            return searchResults;
        }

        public List<Book> getByAuthor(List<Book> bookList, String searchTerm) {
            logger.debug("get by author: {}", searchTerm);
            for (Book book: bookList) {
                Author author = book.getAuthor();
                String authorName = author.getName();
                logger.debug("author name: {}", authorName);

                if (authorName.contains(searchTerm)) {
                    searchResults.add(book);
                }
            }
//            List<Author> authorList = authorDao.getByPropertyLike("name", searchTerm);
//            logger.debug("authorList: {}", authorList);
//
//            for (Author author : authorList) {
//                List<Book> authorBooks = dao.getByPropertyEqualsId("author", author.getId());
//                logger.debug("author books: {}", authorBooks);
//
//                for (Book books : authorBooks) {
//                    book.add(books);
//                }
//                logger.debug("Book list: {}", book);
//            }
            logger.debug("Search results: {}", searchResults);
            return searchResults;
        }
}

