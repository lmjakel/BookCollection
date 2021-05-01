package com.leeannjakel.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leeannjakel.entity.AuthorResponse;
import com.leeannjakel.entity.Info;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class ApiDao {

    public Info getBook(String ISBN) throws JsonProcessingException {

        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target("http://openlibrary.org/isbn/" + ISBN + ".json");
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