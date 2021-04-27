package test.persistence;

import entity.Author;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import persistence.GenericDao;
import test.utilities.Database;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the AuthorDao
 */
public class AuthorDaoTest {

    /**
     * The Dao.
     */
    GenericDao authorDao;

    /**
     * Sets .
     */
    @BeforeEach
    void setup() {
        authorDao = new GenericDao(Author.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets all authors success.
     */
    @Test
    void getAllAuthorsSuccess() {
        List<Author> authors = authorDao.getAll();
        assertEquals(5, authors.size());
    }

    /**
     * Gets author by last name success.
     */
    @Test
    void getAuthorByLastNameSuccess() {
        List<Author> authors = authorDao.getByPropertyLike("lastName", "m");
        assertEquals(1, authors.size());
    }

    /**
     * Gets author by first name success.
     */
    @Test
    void getAuthorByFirstNameSuccess() {
        List<Author> authors = authorDao.getByPropertyLike("firstName", "S");
        assertEquals(3, authors.size());
    }

    /**
     * Gets author id.
     */
    @Test
    void getAuthorId() {
        GenericDao authorDao = new GenericDao(Author.class);
        Author retrievedAuthor = (Author)authorDao.getById(1);
        assertNotNull(retrievedAuthor);
        assertEquals("Sarah J. Maas", retrievedAuthor.getName());
    }

    /**
     * Insert author success.
     */
    @Test
    void insertAuthorSuccess() {
        Author newAuthor = new Author("Kiera Cass");

        int id = authorDao.insert(newAuthor);
        assertNotEquals(0, id);

        Author inseretedAuthor = (Author)authorDao.getById(id);
        assertEquals("Cass", inseretedAuthor.getName());
    }

    /**
     * Delete author success.
     */
    @Test
    void deleteAuthorSuccess() {
        authorDao.delete(authorDao.getById(3));
        assertNull(authorDao.getById(3));
    }

    /**
     * Update author success.
     */
    @Test
    void updateAuthorSuccess() {
        String newLastName = "Smith";
        Author authorToUpdate = (Author)authorDao.getById(2);

        authorToUpdate.setLastName(newLastName);
        authorDao.update(authorToUpdate);
        Author retrievedAuthor = (Author)authorDao.getById(2);

        assertEquals(newLastName, retrievedAuthor.getLastName());

    }
}
