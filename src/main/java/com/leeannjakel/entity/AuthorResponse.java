package com.leeannjakel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


/**
 * The type Author response.
 *
 * @author LeeAnn Jakel Resourse used for JsonIgnoreProperties https://stackoverflow.com/questions/4486787/jackson-with-json-unrecognized-field-not-marked-as-ignorable
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorResponse{
	@JsonProperty("created")
	private Created created;

	@JsonProperty("name")
	private String name;

	@JsonProperty("personalName")
	private String personalName;

	@JsonProperty("type")
	private Type type;

	@JsonProperty("photos")
	private List<Integer> photos;

	@JsonProperty("lastModified")
	private LastModified lastModified;

	@JsonProperty("key")
	private String key;

	@JsonProperty("latestRevision")
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
	 * Set name.
	 *
	 * @param name the name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 * Get name string.
	 *
	 * @return the string
	 */
	public String getName(){
		return name;
	}

	/**
	 * Set personal name.
	 *
	 * @param personalName the personal name
	 */
	public void setPersonalName(String personalName){
		this.personalName = personalName;
	}

	/**
	 * Get personal name string.
	 *
	 * @return the string
	 */
	public String getPersonalName(){
		return personalName;
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
	 * Set photos.
	 *
	 * @param photos the photos
	 */
	public void setPhotos(List<Integer> photos){
		this.photos = photos;
	}

	/**
	 * Get photos list.
	 *
	 * @return the list
	 */
	public List<Integer> getPhotos(){
		return photos;
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
			"AuthorResponse{" +
			"created = '" + created + '\'' +
			",name = '" + name + '\'' +
			",personal_name = '" + personalName + '\'' +
			",type = '" + type + '\'' + 
			",photos = '" + photos + '\'' + 
			",last_modified = '" + lastModified + '\'' + 
			",key = '" + key + '\'' + 
			",latest_revision = '" + latestRevision + '\'' + 
			",revision = '" + revision + '\'' + 
			"}";
		}
}