package test.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import persistence.ApiDao;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApiDaoTest {

    @Test
    void getBookTitle() throws JsonProcessingException {
        ApiDao dao = new ApiDao();
        assertEquals("Throne of glass", dao.getBook().getTitle());
    }
}
