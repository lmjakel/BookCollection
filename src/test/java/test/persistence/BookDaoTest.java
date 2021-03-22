package test.persistence;

import entity.Book;
import entity.Genre;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import persistence.BookDao;
import persistence.GenericDao;
import persistence.GenreDao;
import test.utilities.Database;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookDaoTest {

    GenericDao bookDao;

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

    @Test
    void getBookByTitleSuccess() {
        List<Book> books = bookDao.getByPropertyLike("title", "Thorns");
        assertEquals(1, books.size());
    }

    @Test
    void getBooksByGenreSuccess() {
        List<Book> retrievedBooks = bookDao.getByPropertyEqualsId("genre", 1);
        assertEquals(2, retrievedBooks.size());

    }

    @Test
    void getBooksByAuthorSuccess() {
        List<Book> retrievedBooks = bookDao.getByPropertyEqualsId("author", 1);
        assertEquals(1, retrievedBooks.size());
    }

    @Test
    void getBooksByUserSuccess() {
        List<Book> retrievedBooks = bookDao.getByPropertyEqualsId("user", 1);
        assertEquals(2, retrievedBooks.size());
    }


}
