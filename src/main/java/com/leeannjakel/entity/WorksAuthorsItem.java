package com.leeannjakel.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WorksAuthorsItem {

	@JsonProperty("author")
	private WorksAuthor author;

	@JsonProperty("type")
	private Type type;

	public void setAuthor(WorksAuthor author){
		this.author = author;
	}

	public WorksAuthor getAuthor(){
		return author;
	}

	public void setType(Type type){
		this.type = type;
	}

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