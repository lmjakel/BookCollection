package com.leeannjakel.controller;

import com.leeannjakel.entity.Author;
import com.leeannjakel.entity.Book;
import com.leeannjakel.entity.BookSuggestions;
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
import java.util.*;

/**
        * The Book Suggestions servlet.
        */
@WebServlet(
        urlPatterns = {"/BookSuggestions"}
)
/**
 * class allows user to get book suggestions based on
 * top 3 genres
 * @author LeeAnn Jakel
 */
public class BookSuggestionsPage extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Daos
     */
    GenericDao<Book> bookDao = new GenericDao(Book.class);
    GenericDao<User> userDao = new GenericDao(User.class);
    GenericDao<BookSuggestions> bookSuggestionsDao  = new GenericDao(BookSuggestions.class);
    GenericDao<Author> authorDao  = new GenericDao(Author.class);
    GenericDao<Genre> genreDao  = new GenericDao(Genre.class);
    List<BookSuggestions> bookSuggestionsList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.debug("Suggestions page");
        //gets userid
        String username = req.getUserPrincipal().getName();
        List<User> users = userDao.getByPropertyEqual("userName", username);
        int userId = users.get(0).getId();

        //get genres by user
        List<String> top3Genres = getGenresByUser(userId);

        //get BookSuggestions for each top Genre
        bookSuggestionsList = getBookSuggestionsByGenre(top3Genres);

        //set book info attribute
        req.setAttribute("books", bookSuggestionsList);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/bookSuggestions.jsp");
        dispatcher.forward(req, resp);
    }


    /**
     * This method gets the top 3 genres for the current user and
     * returns them a Map<String, Integer>
     * @param userId the userId
     * @return the top 3 genres
     */
    public List<String> getGenresByUser(int userId) {
        List<Book> retrievedBooks = bookDao.getByPropertyEqualsId("user", userId);
        String currentGenre;
        Map<String, Integer> genreList = new TreeMap<>();

        //creates a Map of all genres stored by a given user
        for(int i=0; i < retrievedBooks.size(); i++) {
            currentGenre = retrievedBooks.get(i).getGenre().getName();
            if(genreList.containsKey(currentGenre)) {
                genreList.put(currentGenre, genreList.get(currentGenre) +1);
            } else {
                genreList.put(currentGenre, 1);
            }
        }
        logger.debug(genreList);
        //finds Key with largest Value
        // Resource: studytonight.com/java-examples/how-to-find-maximum-value-in-java-map
        Map.Entry<String, Integer> maxGenre = null;
        Map.Entry<String, Integer> secondGenre = null;
        Map.Entry<String, Integer> thirdGenre = null;

        for(Map.Entry<String, Integer> genre:genreList.entrySet()){
            if (maxGenre == null || genre.getValue().compareTo(maxGenre.getValue()) >= 0) {
                thirdGenre = secondGenre;
                secondGenre = maxGenre;
                maxGenre = genre;
            }
        }
        logger.debug("Max:{}", maxGenre.getKey());
        logger.debug("2ndMax:{}", secondGenre.getKey());
        logger.debug("3RdMax:{}", thirdGenre.getKey());

        //creates a list of top 3 genres
        List<String> top3Genres = new ArrayList<>();
        top3Genres.add(maxGenre.getKey());
        top3Genres.add(secondGenre.getKey());
        top3Genres.add(thirdGenre.getKey());
        logger.debug("Genre list: {}", top3Genres);

        return top3Genres;
    }


    /**
     * @param top3Genres Map of top 3 genres
     * @return book suggestion list
     */
    public List<BookSuggestions> getBookSuggestionsByGenre(List<String> top3Genres) {
        List<BookSuggestions> retrievedBooks;
        List<Integer> bookPositionsList = new ArrayList<>();

        //gets all books by genre input
        for (int i=0; i < 3; i ++) {
            Genre currentGenre = genreDao.getByPropertyEqual("name", top3Genres.get(i)).get(0);
            retrievedBooks = bookSuggestionsDao.getByPropertyEqualsId("genre", currentGenre.getId());

            //randomly selects 3 books from the list
            int listSize = retrievedBooks.size();
            int min = 1;

            for(int j = 0; j < 3; j ++) {
                int bookPosition = (int) (Math.random() * (listSize - min)) +min;
                int bookId = retrievedBooks.get(bookPosition).getId();
                bookPositionsList.add(bookId);

            }
        }

        for(int k = 0; k < 9; k++) {
            BookSuggestions currentBook = bookSuggestionsDao.getByPropertyEqualsId("id", bookPositionsList.get(k)).get(0);
            logger.debug("Current Book: {}", currentBook.getTitle());
            bookSuggestionsList.add(currentBook);
        }

        logger.debug("Suggestion list: {}", bookSuggestionsList.get(0).getTitle());

        return bookSuggestionsList;
    }

}
