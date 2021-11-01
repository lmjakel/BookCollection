package test.persistence;

import com.leeannjakel.entity.Author;
import com.leeannjakel.entity.Book;
import com.leeannjakel.entity.Genre;
import com.leeannjakel.entity.User;
import com.leeannjakel.entity.BookSuggestions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.leeannjakel.persistence.GenericDao;
import test.utilities.Database;

import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class SuggestionsTest {
    /**
     * The Book dao.
     */
    GenericDao<Book> bookDao;
    /**
     * The BookSuggestions dao.
     */
    GenericDao<BookSuggestions> bookSuggestionsDao;
    /**
     * The Author dao.
     */
    GenericDao<Author> authorDao;
    /**
     * The User dao.
     */
    GenericDao<User> userDao;
    /**
     * The Genre dao.
     */
    GenericDao<Genre> genreDao;


    /**
     * Sets up the database before any tests are fun and instantiates the daos.
     */
    @BeforeEach
    void setup() {
        bookDao = new GenericDao<>(Book.class);
        bookSuggestionsDao = new GenericDao<>(BookSuggestions.class);
        authorDao = new GenericDao<>(Author.class);
        userDao = new GenericDao<>(User.class);
        genreDao = new GenericDao<>(Genre.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets all books success.
     */
    @Test
    void getAllBooksSuccess() {
        List<BookSuggestions> books = bookSuggestionsDao.getAll();
        assertEquals(52, books.size());
    }

    /**
     * Gets books by user success.
     */
    @Test
    void getBooksByUserSuccess() {
        List<Book> retrievedBooks = bookDao.getByPropertyEqualsId("user", 1);
        assertEquals(2, retrievedBooks.size());
    }

    /**
     * Gets genre by user success.
     */
    @Test
    void getGenreByUserSuccess() {
        List<Book> retrievedBooks = bookDao.getByPropertyEqualsId("user", 1);
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

        //outputs the map
        System.out.println(genreList);

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

        //outputs maxEntry
        System.out.println(maxGenre);
        System.out.println(secondGenre);
        System.out.println(thirdGenre);

        //confirms correct number of entries
        assertEquals(2, genreList.size());
    }

    /**
     * Gets 3 random booksuggestions by genre success.
     */
    @Test
    void getBooksSuggestionByGenre() {
        //gets all books by genre input
        List<BookSuggestions> retrievedBooks = bookSuggestionsDao.getByPropertyEqualsId("genre", 1);

        //randomly selects 3 books from the list
        int listSize = retrievedBooks.size();
        int min = 1;
        int max = 9;
        int bookPosition = (int) (Math.random() * (max - min + 1)) +min;
        System.out.println(bookPosition);

        String bookSuggestionTitle = retrievedBooks.get(bookPosition).getTitle();
        System.out.println(bookSuggestionTitle);
        assertEquals(9, retrievedBooks.size());
    }
}
