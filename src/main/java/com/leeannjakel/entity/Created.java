package com.leeannjakel.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Created.
 * For API
 */
public class Created{

	@JsonProperty("type")
	private String type;

	@JsonProperty("value")
	private String value;

	/**
	 * Set type.
	 *
	 * @param type the type
	 */
	public void setType(String type){
		this.type = type;
	}

	/**
	 * Get type string.
	 *
	 * @return the string
	 */
	public String getType(){
		return type;
	}

	/**
	 * Set value.
	 *
	 * @param value the value
	 */
	public void setValue(String value){
		this.value = value;
	}

	/**
	 * Get value string.
	 *
	 * @return the string
	 */
	public String getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"Created{" + 
			"type = '" + type + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}