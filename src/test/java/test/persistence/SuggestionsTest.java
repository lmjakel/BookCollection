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

}
