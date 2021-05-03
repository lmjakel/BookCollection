package com.leeannjakel.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leeannjakel.entity.*;

import static org.assertj.core.api.Assertions.assertThat;

import javax.ws.rs.RedirectionException;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

public class ApiDao {

    public Info getBook(String ISBN) throws JsonProcessingException {

        Client client = ClientBuilder.newClient();
        String response = null;
        Boolean redirecting = true;
        String url = "http://openlibrary.org/isbn/" + ISBN + ".json";

        while(redirecting) {
            WebTarget target =
                    client.target(url);
            try {
                response = target.request(MediaType.APPLICATION_JSON).get(String.class);
                redirecting = false;
            } catch (RedirectionException re) {
                url = re.getLocation().toString();
            }
        }

        ObjectMapper mapper = new ObjectMapper();
        Info bookInfo = mapper.readValue(response, Info.class);

        return bookInfo;
    }

    public String getWorks (String works) throws JsonProcessingException {
        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://openlibrary.org" + works + ".json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        WorksResponse worksInfo = mapper.readValue(response, WorksResponse.class);
        List<WorksAuthorsItem> authors = worksInfo.getAuthors();
        WorksAuthorsItem authorsItem = authors.get(0);
        WorksAuthor authorKey = authorsItem.getAuthor();

        String author = getAuthor(authorKey.getKey());

        return author;
    }

    public String getAuthor (String author) throws JsonProcessingException {

        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://openlibrary.org" + author + ".json");
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        AuthorResponse authorInfo = mapper.readValue(response, AuthorResponse.class);
        String authorName = authorInfo.getName();

        return authorName;
    }


}
