package persistence;

import entity.Author;
import entity.Book;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * @author LeeAnn Jakel
 *
 * BookDao Class
 */
public class BookDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Session factory.
     */
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    public List<Book> getAllBooks() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Book> query = builder.createQuery(Book.class);
        Root<Book> root = query.from(Book.class);
        List<Book> books = session.createQuery(query).getResultList();

        session.close();

        return books;

    }

    public List<Book> searchByTitle(String search) {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Book> query = builder.createQuery(Book.class);
        Root<Book> root = query.from(Book.class);

        Expression<String> propertyPath = root.get("title");
        query.where(builder.like(propertyPath, "%" + search + "%"));
        List<Book> books = session.createQuery(query).getResultList();

        session.close();

        return books;
    }
}
