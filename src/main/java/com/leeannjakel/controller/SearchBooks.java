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
    /**
     * The Dao.
     */
    GenericDao<Book> dao = new GenericDao(Book.class);
    /**
     * The Author dao.
     */
    GenericDao<Author> authorDao = new GenericDao(Author.class);
    /**
     * The Genre dao.
     */
    GenericDao<Genre> genreDao = new GenericDao(Genre.class);
    /**
     * The User dao.
     */
    GenericDao<User> userDao = new GenericDao(User.class);
    /**
     * The Search results.
     */
    List<Book> searchResults = new ArrayList<Book>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getUserPrincipal().getName();
        List<User> users = userDao.getByPropertyEqual("userName", username);
        int userId = users.get(0).getId();

        String searchType = req.getParameter("type");
        String searchTerm = req.getParameter("searchTerm").toLowerCase();

        searchResults.clear();
        searchResults = getUser(searchType, searchTerm, userId);

        req.setAttribute("book", searchResults);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
        }

    /**
     * Gets current user and pass the user's book list and search term to another
     * method depending on the search type selected
     *
     * @param searchType the search type
     * @param searchTerm the search term
     * @param userId     the user id
     * @return the user
     */
    public List<Book> getUser (String searchType, String searchTerm, int userId) {
            List<Book> bookList = dao.getByPropertyEqualsId("user", userId);
            logger.debug("current user book list: {}", bookList);

            if (searchType.equals("viewAll")) {
                searchResults = bookList;
            } else {
                logger.debug("search type: {}", searchType);
                logger.debug("search term: {}", searchTerm);

                switch (searchType) {
                    case "author":

                        searchResults = getByAuthor(bookList, searchTerm);
                        logger.debug("Search results author: {}", searchResults);

                        break;
                    case "genre":
                        searchResults = getByGenre(bookList, searchTerm);
                        logger.debug("Search results genre: {}", searchResults);

                        break;
                    case "title":
                        searchResults = getByTitle(bookList, searchTerm);
                        logger.debug("Search results title: {}", searchResults);

                        break;
                }
            }
            return searchResults;
        }

    /**
     * Gets book list by author.
     *
     * @param bookList   the book list
     * @param searchTerm the search term
     * @return the by author
     */
    public List<Book> getByAuthor(List<Book> bookList, String searchTerm) {
            logger.debug("get by author: {}", searchTerm);
            for (Book book: bookList) {
                Author author = book.getAuthor();
                String authorName = author.getName();
                logger.debug("author name: {}", authorName);
                authorName = authorName.toLowerCase();

                if (authorName.contains(searchTerm)) {
                    searchResults.add(book);
                }
            }

            logger.debug("Search results: {}", searchResults);
            return searchResults;
        }

    /**
     * Gets book list by genre.
     *
     * @param bookList   the book list
     * @param searchTerm the search term
     * @return the by genre
     */
    public List<Book> getByGenre (List<Book> bookList, String searchTerm) {
            logger.debug("get by genre: {}", searchTerm);
            for (Book book: bookList) {
                Genre genre = book.getGenre();
                String genreName = genre.getName();
                logger.debug("genre name: {}", genreName);
                genreName = genreName.toLowerCase();

                if (genreName.contains(searchTerm)) {
                    searchResults.add(book);
                }
            }

            logger.debug("Search results: {}", searchResults);
            return searchResults;
        }

    /**
     * Gets book list by title.
     *
     * @param bookList   the book list
     * @param searchTerm the search term
     * @return the by title
     */
    public List<Book> getByTitle(List<Book> bookList, String searchTerm) {
            logger.debug("get by title: {}", searchTerm);
            for (Book book: bookList) {
                String bookTitle = book.getTitle();
                logger.debug("title name: {}", bookTitle);
                bookTitle = bookTitle.toLowerCase();

                if (bookTitle.contains(searchTerm)) {
                    searchResults.add(book);
                }
            }

            logger.debug("Search results: {}", searchResults);
            return searchResults;
        }
}

