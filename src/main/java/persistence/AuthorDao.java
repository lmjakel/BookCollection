package persistence;

import entity.Author;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Author dao.
 * @author LeeAnn Jakel
 */
public class AuthorDao {


    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Session factory.
     */
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();


    /**
     * Gets all authors.
     *
     * @return the all authors
     */
    public List<Author> getAllAuthors() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Author> query = builder.createQuery(Author.class);
        Root<Author> root = query.from(Author.class);
        List<Author> authors = session.createQuery(query).getResultList();

        session.close();

        return authors;
    }

    public List<Author> searchByLastName(String search) {
        logger.debug("Author search: {}",  search);

        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Author> query = builder.createQuery(Author.class);
        Root<Author> root = query.from(Author.class);

        Expression<String> propertyPath = root.get("lastName");
        query.where(builder.like(propertyPath, "%" + search + "%"));
        List<Author> authors = session.createQuery(query).getResultList();

        session.close();

        return authors;
    }

    public List<Author> searchByFirstName(String search) {
        logger.debug("Author search: {}",  search);

        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Author> query = builder.createQuery(Author.class);
        Root<Author> root = query.from(Author.class);

        Expression<String> propertyPath = root.get("firstName");
        query.where(builder.like(propertyPath, "%" + search + "%"));
        List<Author> authors = session.createQuery(query).getResultList();

        session.close();

        return authors;
    }

    public Author getByID(int id) {
        Session session = sessionFactory.openSession();

        Author author = session.get(Author.class, id);

        session.close();

        return author;
    }

    public int insert(Author newAuthor) {
        int id = 0;
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        id = (int)session.save(newAuthor);
        transaction.commit();

        session.close();

        return id;
    }

    public void delete(Author authorId) {
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        session.delete(authorId);
        transaction.commit();

        session.close();
    }

    public void update(Author authorToUpdate) {
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        session.update(authorToUpdate);
        transaction.commit();

        session.close();
    }
}
