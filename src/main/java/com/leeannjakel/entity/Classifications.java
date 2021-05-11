package com.leeannjakel.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Classifications.
 * For API
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Classifications{

	@Override
 	public String toString(){
		return 
			"Classifications{" + 
			"}";
		}
}