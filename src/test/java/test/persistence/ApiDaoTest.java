package test.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import persistence.ApiDao;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApiDaoTest {

    @Test
    void getBookTitle() throws JsonProcessingException {
        ApiDao dao = new ApiDao();
        String ISBN = "9781599906959";
        assertEquals("Throne of glass", dao.getBook(ISBN).getTitle());
    }
}
