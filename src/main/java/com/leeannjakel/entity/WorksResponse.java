package com.leeannjakel.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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

	public void setCreated(Created created){
		this.created = created;
	}

	public Created getCreated(){
		return created;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setType(Type type){
		this.type = type;
	}

	public Type getType(){
		return type;
	}

	public void setLastModified(LastModified lastModified){
		this.lastModified = lastModified;
	}

	public LastModified getLastModified(){
		return lastModified;
	}

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	public void setAuthors(List<WorksAuthorsItem> authors){
		this.authors = authors;
	}

	public List<WorksAuthorsItem> getAuthors(){
		return authors;
	}

	public void setLatestRevision(int latestRevision){
		this.latestRevision = latestRevision;
	}

	public int getLatestRevision(){
		return latestRevision;
	}

	public void setRevision(int revision){
		this.revision = revision;
	}

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