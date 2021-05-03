package com.leeannjakel.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Info{

	@JsonProperty("pagination")
	private String pagination;

	@JsonProperty("works")
	private List<WorksItem> works;

	@JsonProperty("number_of_pages")
	private int numberOfPages;

	@JsonProperty("description")
	private String description;

	@JsonProperty("title")
	private String title;

	@JsonProperty("edition_name")
	private String editionName;

	@JsonProperty("type")
	private Type type;

	@JsonProperty("isbn_13")
	private List<String> isbn13;

	@JsonProperty("publish_places")
	private List<String> publishPlaces;

	@JsonProperty("lccn")
	private List<String> lccn;

	@JsonProperty("publish_country")
	private String publishCountry;

	@JsonProperty("by_statement")
	private String byStatement;

	@JsonProperty("publishers")
	private List<String> publishers;

	@JsonProperty("dewey_decimal_class")
	private List<String> deweyDecimalClass;

	@JsonProperty("physical_format")
	private String physicalFormat;

	@JsonProperty("lc_classifications")
	private List<String> lcClassifications;

	@JsonProperty("last_modified")
	private LastModified lastModified;

	@JsonProperty("key")
	private String key;

	@JsonProperty("covers")
	private List<Integer> covers;

	@JsonProperty("local_id")
	private List<String> localId;

	@JsonProperty("languages")
	private List<LanguagesItem> languages;

	@JsonProperty("identifiers")
	private Identifiers identifiers;

	@JsonProperty("created")
	private Created created;

	@JsonProperty("subjects")
	private List<String> subjects;

	@JsonProperty("source_records")
	private List<String> sourceRecords;

	@JsonProperty("revision")
	private int revision;

	@JsonProperty("classifications")
	private Classifications classifications;

	@JsonProperty("publish_date")
	private String publishDate;

	@JsonProperty("latest_revision")
	private int latestRevision;

	@JsonProperty("authors")
	private List<AuthorsItem> authors;

	public void setPagination(String pagination){
		this.pagination = pagination;
	}

	public String getPagination(){
		return pagination;
	}

	public void setWorks(List<WorksItem> works){
		this.works = works;
	}

	public List<WorksItem> getWorks(){
		return works;
	}

	public void setNumberOfPages(int numberOfPages){
		this.numberOfPages = numberOfPages;
	}

	public int getNumberOfPages(){
		return numberOfPages;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setEditionName(String editionName){
		this.editionName = editionName;
	}

	public String getEditionName(){
		return editionName;
	}

	public void setType(Type type){
		this.type = type;
	}

	public Type getType(){
		return type;
	}

	public void setIsbn13(List<String> isbn13){
		this.isbn13 = isbn13;
	}

	public List<String> getIsbn13(){
		return isbn13;
	}

	public void setPublishPlaces(List<String> publishPlaces){
		this.publishPlaces = publishPlaces;
	}

	public List<String> getPublishPlaces(){
		return publishPlaces;
	}

	public void setLccn(List<String> lccn){
		this.lccn = lccn;
	}

	public List<String> getLccn(){
		return lccn;
	}

	public void setPublishCountry(String publishCountry){
		this.publishCountry = publishCountry;
	}

	public String getPublishCountry(){
		return publishCountry;
	}

	public void setByStatement(String byStatement){
		this.byStatement = byStatement;
	}

	public String getByStatement(){
		return byStatement;
	}

	public void setPublishers(List<String> publishers){
		this.publishers = publishers;
	}

	public List<String> getPublishers(){
		return publishers;
	}

	public void setDeweyDecimalClass(List<String> deweyDecimalClass){
		this.deweyDecimalClass = deweyDecimalClass;
	}

	public List<String> getDeweyDecimalClass(){
		return deweyDecimalClass;
	}

	public void setPhysicalFormat(String physicalFormat){
		this.physicalFormat = physicalFormat;
	}

	public String getPhysicalFormat(){
		return physicalFormat;
	}

	public void setLcClassifications(List<String> lcClassifications){
		this.lcClassifications = lcClassifications;
	}

	public List<String> getLcClassifications(){
		return lcClassifications;
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

	public void setCovers(List<Integer> covers){
		this.covers = covers;
	}

	public List<Integer> getCovers(){
		return covers;
	}

	public void setLocalId(List<String> localId){
		this.localId = localId;
	}

	public List<String> getLocalId(){
		return localId;
	}

	public void setLanguages(List<LanguagesItem> languages){
		this.languages = languages;
	}

	public List<LanguagesItem> getLanguages(){
		return languages;
	}

	public void setIdentifiers(Identifiers identifiers){
		this.identifiers = identifiers;
	}

	public Identifiers getIdentifiers(){
		return identifiers;
	}

	public void setCreated(Created created){
		this.created = created;
	}

	public Created getCreated(){
		return created;
	}

	public void setSubjects(List<String> subjects){
		this.subjects = subjects;
	}

	public List<String> getSubjects(){
		return subjects;
	}

	public void setSourceRecords(List<String> sourceRecords){
		this.sourceRecords = sourceRecords;
	}

	public List<String> getSourceRecords(){
		return sourceRecords;
	}

	public void setRevision(int revision){
		this.revision = revision;
	}

	public int getRevision(){
		return revision;
	}

	public void setClassifications(Classifications classifications){
		this.classifications = classifications;
	}

	public Classifications getClassifications(){
		return classifications;
	}

	public void setPublishDate(String publishDate){
		this.publishDate = publishDate;
	}

	public String getPublishDate(){
		return publishDate;
	}

	public void setLatestRevision(int latestRevision){
		this.latestRevision = latestRevision;
	}

	public int getLatestRevision(){
		return latestRevision;
	}

	public void setAuthors(List<AuthorsItem> authors){
		this.authors = authors;
	}

	public List<AuthorsItem> getAuthors(){
		return authors;
	}

	@Override
 	public String toString(){
		return 
			"Info{" + 
			"pagination = '" + pagination + '\'' + 
			",works = '" + works + '\'' + 
			",number_of_pages = '" + numberOfPages + '\'' + 
			",description = '" + description + '\'' + 
			",title = '" + title + '\'' + 
			",edition_name = '" + editionName + '\'' + 
			",type = '" + type + '\'' + 
			",isbn_13 = '" + isbn13 + '\'' + 
			",publish_places = '" + publishPlaces + '\'' + 
			",lccn = '" + lccn + '\'' + 
			",publish_country = '" + publishCountry + '\'' + 
			",by_statement = '" + byStatement + '\'' + 
			",publishers = '" + publishers + '\'' + 
			",dewey_decimal_class = '" + deweyDecimalClass + '\'' + 
			",physical_format = '" + physicalFormat + '\'' + 
			",lc_classifications = '" + lcClassifications + '\'' + 
			",last_modified = '" + lastModified + '\'' + 
			",key = '" + key + '\'' + 
			",covers = '" + covers + '\'' + 
			",local_id = '" + localId + '\'' + 
			",languages = '" + languages + '\'' + 
			",identifiers = '" + identifiers + '\'' + 
			",created = '" + created + '\'' + 
			",subjects = '" + subjects + '\'' + 
			",source_records = '" + sourceRecords + '\'' + 
			",revision = '" + revision + '\'' + 
			",classifications = '" + classifications + '\'' + 
			",publish_date = '" + publishDate + '\'' + 
			",latest_revision = '" + latestRevision + '\'' + 
			",authors = '" + authors + '\'' + 
			"}";
		}
}