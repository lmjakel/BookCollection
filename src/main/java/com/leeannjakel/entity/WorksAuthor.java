package com.leeannjakel.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Works author.
 * For API
 */
public class WorksAuthor{

    @JsonProperty("key")
    private String key;

    /**
     * Set key.
     *
     * @param key the key
     */
    public void setKey(String key){
        this.key = key;
    }

    /**
     * Get key string.
     *
     * @return the string
     */
    public String getKey(){
        return key;
    }

    @Override
    public String toString(){
        return
                "WorksAuthor{" +
                        "key = '" + key + '\'' +
                        "}";
    }
}