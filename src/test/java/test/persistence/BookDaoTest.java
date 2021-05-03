package test.persistence;

import com.leeannjakel.entity.Author;
import com.leeannjakel.entity.Book;
import com.leeannjakel.entity.Genre;
import com.leeannjakel.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.leeannjakel.persistence.GenericDao;
import test.utilities.Database;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

    /**
     * Insert author success.
     */
    @Test
    void insertBookSuccess() {
        GenericDao<Author> authorDao = new GenericDao<>(Author.class);
        List<Author> author = authorDao.getByPropertyEqual("name", "Sarah J. Maas");
        Author bookAuthor = author.get(0);

        GenericDao<User> userDao = new GenericDao<>(User.class);
        User user = userDao.getById(1);


        GenericDao<Genre> genreDao = new GenericDao<>(Genre.class);
        Genre genre = genreDao.getById(1);


        Book newBook= new Book("A Court of Thorns and Roses", "9781408857861", bookAuthor, user, genre, "Also lovely books by SJM" );

        int id = bookDao.insert(newBook);
        assertNotEquals(0, id);

        Book insertedBook = (Book)bookDao.getById(id);
        assertEquals("A Court of Thorns and Roses", insertedBook.getTitle());
    }

}
