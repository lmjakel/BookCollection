package com.leeannjakel.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leeannjakel.entity.AuthorResponse;
import com.leeannjakel.entity.Info;
import org.assertj.core.api.Assertions;
import org.glassfish.jersey.client.ClientProperties;
import static org.assertj.core.api.Assertions.assertThat;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class ApiDao {

    public Info getBook(String ISBN) throws JsonProcessingException {

        Client client = ClientBuilder.newClient();

        WebTarget target =
                client.target("http://openlibrary.org/isbn/" + ISBN + ".json")
                .property(ClientProperties.FOLLOW_REDIRECTS, Boolean.TRUE);

        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);


        ObjectMapper mapper = new ObjectMapper();
        Info bookInfo = mapper.readValue(response, Info.class);

        return bookInfo;
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
