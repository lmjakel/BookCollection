package com.leeannjakel.entity;

public class LastModified{
	private String type;
	private String value;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"LastModified{" + 
			"type = '" + type + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}
