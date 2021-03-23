package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthorsItem{

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
			"AuthorsItem{" + 
			"key = '" + key + '\'' + 
			"}";
		}
}