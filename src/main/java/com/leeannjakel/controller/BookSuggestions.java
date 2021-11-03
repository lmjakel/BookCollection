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
public class BookSuggestions extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Daos
     */
    GenericDao<Book> bookDao = new GenericDao(Book.class);
    GenericDao<User> userDao = new GenericDao(User.class);
    GenericDao<BookSuggestions> bookSuggestionsDao  = new GenericDao(BookSuggestions.class);
    GenericDao<Author> authorDao  = new GenericDao(Author.class);
    GenericDao<Genre> genreDao  = new GenericDao(Genre.class);

    /**
     * The Search results Lists.
     */
    List<Book> searchResults = new ArrayList<Book>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //gets userid
        String username = req.getUserPrincipal().getName();
        List<User> users = userDao.getByPropertyEqual("userName", username);
        int userId = users.get(0).getId();

        //get genres by user
        Map<String, Integer> top3Genres = getGenresByUser(userId);

        //get BookSuggestions for each top Genre


        req.setAttribute("book", searchResults);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }


    /**
     * This method gets the top 3 genres for the current user and
     * returns them a Map<String, Integer>
     * @param userId the userId
     * @return the top 3 genres
     */
    public Map<String,Integer> getGenresByUser(int userId) {
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

        //finds Key with largest Value
        // Resource: studytonight.com/java-examples/how-to-find-maximum-value-in-java-map
        Map.Entry<String, Integer> maxGenre = null;
        Map.Entry<String, Integer> secondGenre = null;
        Map.Entry<String, Integer> thirdGenre = null;


        for(Map.Entry<String, Integer> genre:genreList.entrySet()){
            if (maxGenre == null || genre.getValue().compareTo(maxGenre.getValue()) > 0) {
                thirdGenre = secondGenre;
                secondGenre = maxGenre;
                maxGenre = genre;
            }
        }
        Map<String, Integer> topGenres = new HashMap<>();
        topGenres.put(maxGenre.getKey(), maxGenre.getValue());
        topGenres.put(secondGenre.getKey(), secondGenre.getValue());
        topGenres.put(thirdGenre.getKey(), thirdGenre.getValue());

        return topGenres;
    }

}
