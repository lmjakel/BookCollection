package com.leeannjakel.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leeannjakel.entity.*;
import com.leeannjakel.utilities.*;


import javax.ws.rs.RedirectionException;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.*;

/**
 * The type Api dao.
 * @author LeeAnn Jakel
 */
public class ApiDao implements PropertiesLoader {
    Properties properties = new Properties();
    String libraryUrl;

    /**
     * Gets book.
     *
     * @param ISBN the isbn
     * @return the book
     * @throws JsonProcessingException the json processing exception
     */
    public Info getBook(String ISBN) throws JsonProcessingException {
        properties = loadProperties();
        String libraryBookUrl = properties.getProperty("open.library.book");

        Client client = ClientBuilder.newClient();
        String response = null;
        Boolean redirecting = true;
        String url = libraryBookUrl + ISBN + ".json";


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

    /**
     * Gets works.
     *
     * @param works the works
     * @return the works
     * @throws JsonProcessingException the json processing exception
     */
    public String getWorks (String works) throws JsonProcessingException {
        properties = loadProperties();
        libraryUrl = properties.getProperty("open.library");

        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target(libraryUrl + works + ".json");

        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        WorksResponse worksInfo = mapper.readValue(response, WorksResponse.class);
        List<WorksAuthorsItem> authors = worksInfo.getAuthors();
        WorksAuthorsItem authorsItem = authors.get(0);
        WorksAuthor authorKey = authorsItem.getAuthor();

        String author = getAuthor(authorKey.getKey());

        return author;
    }

    /**
     * Gets author.
     *
     * @param author the author
     * @return the author
     * @throws JsonProcessingException the json processing exception
     */
    public String getAuthor (String author) throws JsonProcessingException {
        properties = loadProperties();
        libraryUrl = properties.getProperty("open.library");

        Client client = ClientBuilder.newClient();
        WebTarget target =
                client.target(libraryUrl + author + ".json");

        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        ObjectMapper mapper = new ObjectMapper();
        AuthorResponse authorInfo = mapper.readValue(response, AuthorResponse.class);
        String authorName = authorInfo.getName();

        return authorName;
    }

}
