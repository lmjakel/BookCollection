package test.persistence;

import entity.Author;
import persistence.AuthorDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
    AuthorDao dao;

    /**
     * Sets .
     */
    @BeforeEach
    void setup() {
        dao = new AuthorDao();

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets all authors success.
     */
    @Test
    void getAllAuthorsSuccess() {
        List<Author> authors = dao.getAllAuthors();
        assertEquals(5, authors.size());
    }

    /**
     * Gets author by last name success.
     */
    @Test
    void getAuthorByLastNameSuccess() {
        List<Author> authors = dao.searchByLastName("m");
        assertEquals(1, authors.size());
    }

    /**
     * Gets author by first name success.
     */
    @Test
    void getAuthorByFirstNameSuccess() {
        List<Author> authors = dao.searchByFirstName("S");
        assertEquals(3, authors.size());
    }

    /**
     * Gets author id.
     */
    @Test
    void getAuthorId() {
        Author retrievedAuthor = dao.getByID(1);
        assertNotNull(retrievedAuthor);
        assertEquals("Sarah J.", retrievedAuthor.getFirstName());
    }

    /**
     * Insert author success.
     */
    @Test
    void insertAuthorSuccess() {
        Author newAuthor = new Author("Cass", "Kiera");

        int id = dao.insert(newAuthor);
        assertNotEquals(0, id);

        Author inseretedAuthor = dao.getByID(id);
        assertEquals("Kiera", inseretedAuthor.getFirstName());
        assertEquals("Cass", inseretedAuthor.getLastName());
    }

    /**
     * Delete author success.
     */
    @Test
    void deleteAuthorcess() {
        dao.delete(dao.getByID(3));
        assertNull(dao.getByID(3));
    }

    /**
     * Update author success.
     */
    @Test
    void updateAuthorSuccess() {
        String newLastName = "Smith";
        Author authorToUpdate = dao.getByID(2);

        authorToUpdate.setLastName(newLastName);
        dao.update(authorToUpdate);
        Author retrievedAuthor = dao.getByID(2);

        assertEquals(newLastName, retrievedAuthor.getLastName());

    }
}
