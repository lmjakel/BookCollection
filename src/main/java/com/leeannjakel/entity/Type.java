package com.leeannjakel.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Type{

	@JsonProperty("key")
	private String key;

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}

	@Override
 	public String toString(){
		return 
			"Type{" + 
			"key = '" + key + '\'' + 
			"}";
		}
}