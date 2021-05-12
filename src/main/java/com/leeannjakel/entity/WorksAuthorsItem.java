package com.leeannjakel.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Works authors item.
 * For API
 */
public class WorksAuthorsItem {

	@JsonProperty("author")
	private WorksAuthor author;

	@JsonProperty("type")
	private Type type;

	/**
	 * Set author.
	 *
	 * @param author the author
	 */
	public void setAuthor(WorksAuthor author){
		this.author = author;
	}

	/**
	 * Get author works author.
	 *
	 * @return the works author
	 */
	public WorksAuthor getAuthor(){
		return author;
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

	@Override
 	public String toString(){
		return 
			"WorksAuthorsItem{" +
			"author = '" + author + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}