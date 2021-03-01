package test.persistence;

import entity.Book;
import entity.Genre;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import persistence.BookDao;
import persistence.GenreDao;
import test.utilities.Database;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookDaoTest {

    BookDao dao;

    @BeforeEach
    void setup() {
        dao = new BookDao();

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets all books success.
     */
    @Test
    void getAllBooksSuccess() {
        List<Book> books = dao.getAllBooks();
        assertEquals(3, books.size());
    }

    @Test
    void getBookByTitleSuccess() {
        List<Book> books = dao.searchByTitle("Thorns");
        assertEquals(1, books.size());
    }

    @Test
    void getBooksByGenreSuccess() {
        List<Book> retrievedBooks = dao.searchByGenre(1);
        assertEquals(2, retrievedBooks.size());

    }

    @Test
    void getBooksByAuthorSuccess() {
        List<Book> retrievedBooks = dao.searchByAuthor(1);
        assertEquals(1, retrievedBooks.size());
    }

    @Test
    void getBooksByUserSuccess() {
        List<Book> retrievedBooks = dao.searchByUser(1);
        assertEquals(2, retrievedBooks.size());
    }


}
