package com.leeannjakel.entity;

public class Type{
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
