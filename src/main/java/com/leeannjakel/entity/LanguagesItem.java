package com.leeannjakel.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LanguagesItem{

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
			"LanguagesItem{" + 
			"key = '" + key + '\'' + 
			"}";
		}
}