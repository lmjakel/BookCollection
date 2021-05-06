package com.leeannjakel.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Works response.
 * For API
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorksResponse{

	@JsonProperty("created")
	private Created created;

	@JsonProperty("title")
	private String title;

	@JsonProperty("type")
	private Type type;

	@JsonProperty("last_modified")
	private LastModified lastModified;

	@JsonProperty("key")
	private String key;

	@JsonProperty("authors")
	private List<WorksAuthorsItem> authors;

	@JsonProperty("latest_revision")
	private int latestRevision;

	@JsonProperty("revision")
	private int revision;

    /**
     * Set created.
     *
     * @param created the created
     */
    public void setCreated(Created created){
		this.created = created;
	}

    /**
     * Get created created.
     *
     * @return the created
     */
    public Created getCreated(){
		return created;
	}

    /**
     * Set title.
     *
     * @param title the title
     */
    public void setTitle(String title){
		this.title = title;
	}

    /**
     * Get title string.
     *
     * @return the string
     */
    public String getTitle(){
		return title;
	}

    /**
     * Set type.
     *
     * @param type the type
     */
    public void setType(Type type){
		this.type = type;
	}

    /**
     * Get type type.
     *
     * @return the type
     */
    public Type getType(){
		return type;
	}

    /**
     * Set last modified.
     *
     * @param lastModified the last modified
     */
    public void setLastModified(LastModified lastModified){
		this.lastModified = lastModified;
	}

    /**
     * Get last modified last modified.
     *
     * @return the last modified
     */
    public LastModified getLastModified(){
		return lastModified;
	}

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

    /**
     * Set authors.
     *
     * @param authors the authors
     */
    public void setAuthors(List<WorksAuthorsItem> authors){
		this.authors = authors;
	}

    /**
     * Get authors list.
     *
     * @return the list
     */
    public List<WorksAuthorsItem> getAuthors(){
		return authors;
	}

    /**
     * Set latest revision.
     *
     * @param latestRevision the latest revision
     */
    public void setLatestRevision(int latestRevision){
		this.latestRevision = latestRevision;
	}

    /**
     * Get latest revision int.
     *
     * @return the int
     */
    public int getLatestRevision(){
		return latestRevision;
	}

    /**
     * Set revision.
     *
     * @param revision the revision
     */
    public void setRevision(int revision){
		this.revision = revision;
	}

    /**
     * Get revision int.
     *
     * @return the int
     */
    public int getRevision(){
		return revision;
	}

	@Override
 	public String toString(){
		return 
			"WorksResponse{" + 
			"created = '" + created + '\'' + 
			",title = '" + title + '\'' + 
			",type = '" + type + '\'' + 
			",last_modified = '" + lastModified + '\'' + 
			",key = '" + key + '\'' + 
			",authors = '" + authors + '\'' + 
			",latest_revision = '" + latestRevision + '\'' + 
			",revision = '" + revision + '\'' + 
			"}";
		}
}