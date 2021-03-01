package persistence;

import entity.Author;
import entity.Genre;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class GenreDao {


    private final Logger logger = LogManager.getLogger(this.getClass());
    /**
     * The Session factory.
     */
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();


    public Genre getById(int id) {
        Session session = sessionFactory.openSession();

        Genre genre = session.get(Genre.class, id);

        session.close();

        return genre;
    }
}
