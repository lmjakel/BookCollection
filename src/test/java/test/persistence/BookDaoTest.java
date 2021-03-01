package test.persistence;

import entity.Author;
import entity.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import persistence.AuthorDao;
import persistence.BookDao;
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
}
