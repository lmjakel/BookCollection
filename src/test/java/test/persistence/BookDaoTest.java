package test.persistence;

import entity.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import persistence.GenericDao;
import test.utilities.Database;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The type Book dao test.
 */
public class BookDaoTest {

    /**
     * The Book dao.
     */
    GenericDao bookDao;

    /**
     * Sets .
     */
    @BeforeEach
    void setup() {
        bookDao = new GenericDao(Book.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets all books success.
     */
    @Test
    void getAllBooksSuccess() {
        List<Book> books = bookDao.getAll();
        assertEquals(4, books.size());
    }

    /**
     * Gets book by title success.
     */
    @Test
    void getBookByTitleSuccess() {
        List<Book> books = bookDao.getByPropertyLike("title", "Thorns");
        assertEquals(1, books.size());
    }

    /**
     * Gets books by genre success.
     */
    @Test
    void getBooksByGenreSuccess() {
        List<Book> retrievedBooks = bookDao.getByPropertyEqualsId("genre", 1);
        assertEquals(2, retrievedBooks.size());

    }

    /**
     * Gets books by author success.
     */
    @Test
    void getBooksByAuthorSuccess() {
        List<Book> retrievedBooks = bookDao.getByPropertyEqualsId("author", 1);
        assertEquals(1, retrievedBooks.size());
    }

    /**
     * Gets books by user success.
     */
    @Test
    void getBooksByUserSuccess() {
        List<Book> retrievedBooks = bookDao.getByPropertyEqualsId("user", 1);
        assertEquals(2, retrievedBooks.size());
    }


}
