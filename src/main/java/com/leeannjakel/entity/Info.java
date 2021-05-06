package com.leeannjakel.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Info.
 * For API
 */
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

    /**
     * Set pagination.
     *
     * @param pagination the pagination
     */
    public void setPagination(String pagination){
		this.pagination = pagination;
	}

    /**
     * Get pagination string.
     *
     * @return the string
     */
    public String getPagination(){
		return pagination;
	}

    /**
     * Set works.
     *
     * @param works the works
     */
    public void setWorks(List<WorksItem> works){
		this.works = works;
	}

    /**
     * Get works list.
     *
     * @return the list
     */
    public List<WorksItem> getWorks(){
		return works;
	}

    /**
     * Set number of pages.
     *
     * @param numberOfPages the number of pages
     */
    public void setNumberOfPages(int numberOfPages){
		this.numberOfPages = numberOfPages;
	}

    /**
     * Get number of pages int.
     *
     * @return the int
     */
    public int getNumberOfPages(){
		return numberOfPages;
	}

    /**
     * Set description.
     *
     * @param description the description
     */
    public void setDescription(String description){
		this.description = description;
	}

    /**
     * Get description string.
     *
     * @return the string
     */
    public String getDescription(){
		return description;
	}

    /**
     * Set title.
     *
     * @param title the title
     */
    public void setTitle(String title){
		this.title = title;
	}

    /**
     * Get title string.
     *
     * @return the string
     */
    public String getTitle(){
		return title;
	}

    /**
     * Set edition name.
     *
     * @param editionName the edition name
     */
    public void setEditionName(String editionName){
		this.editionName = editionName;
	}

    /**
     * Get edition name string.
     *
     * @return the string
     */
    public String getEditionName(){
		return editionName;
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

    /**
     * Set isbn 13.
     *
     * @param isbn13 the isbn 13
     */
    public void setIsbn13(List<String> isbn13){
		this.isbn13 = isbn13;
	}

    /**
     * Get isbn 13 list.
     *
     * @return the list
     */
    public List<String> getIsbn13(){
		return isbn13;
	}

    /**
     * Set publish places.
     *
     * @param publishPlaces the publish places
     */
    public void setPublishPlaces(List<String> publishPlaces){
		this.publishPlaces = publishPlaces;
	}

    /**
     * Get publish places list.
     *
     * @return the list
     */
    public List<String> getPublishPlaces(){
		return publishPlaces;
	}

    /**
     * Set lccn.
     *
     * @param lccn the lccn
     */
    public void setLccn(List<String> lccn){
		this.lccn = lccn;
	}

    /**
     * Get lccn list.
     *
     * @return the list
     */
    public List<String> getLccn(){
		return lccn;
	}

    /**
     * Set publish country.
     *
     * @param publishCountry the publish country
     */
    public void setPublishCountry(String publishCountry){
		this.publishCountry = publishCountry;
	}

    /**
     * Get publish country string.
     *
     * @return the string
     */
    public String getPublishCountry(){
		return publishCountry;
	}

    /**
     * Set by statement.
     *
     * @param byStatement the by statement
     */
    public void setByStatement(String byStatement){
		this.byStatement = byStatement;
	}

    /**
     * Get by statement string.
     *
     * @return the string
     */
    public String getByStatement(){
		return byStatement;
	}

    /**
     * Set publishers.
     *
     * @param publishers the publishers
     */
    public void setPublishers(List<String> publishers){
		this.publishers = publishers;
	}

    /**
     * Get publishers list.
     *
     * @return the list
     */
    public List<String> getPublishers(){
		return publishers;
	}

    /**
     * Set dewey decimal class.
     *
     * @param deweyDecimalClass the dewey decimal class
     */
    public void setDeweyDecimalClass(List<String> deweyDecimalClass){
		this.deweyDecimalClass = deweyDecimalClass;
	}

    /**
     * Get dewey decimal class list.
     *
     * @return the list
     */
    public List<String> getDeweyDecimalClass(){
		return deweyDecimalClass;
	}

    /**
     * Set physical format.
     *
     * @param physicalFormat the physical format
     */
    public void setPhysicalFormat(String physicalFormat){
		this.physicalFormat = physicalFormat;
	}

    /**
     * Get physical format string.
     *
     * @return the string
     */
    public String getPhysicalFormat(){
		return physicalFormat;
	}

    /**
     * Set lc classifications.
     *
     * @param lcClassifications the lc classifications
     */
    public void setLcClassifications(List<String> lcClassifications){
		this.lcClassifications = lcClassifications;
	}

    /**
     * Get lc classifications list.
     *
     * @return the list
     */
    public List<String> getLcClassifications(){
		return lcClassifications;
	}

    /**
     * Set last modified.
     *
     * @param lastModified the last modified
     */
    public void setLastModified(LastModified lastModified){
		this.lastModified = lastModified;
	}

    /**
     * Get last modified last modified.
     *
     * @return the last modified
     */
    public LastModified getLastModified(){
		return lastModified;
	}

    /**
     * Set key.
     *
     * @param key the key
     */
    public void setKey(String key){
		this.key = key;
	}

    /**
     * Get key string.
     *
     * @return the string
     */
    public String getKey(){
		return key;
	}

    /**
     * Set covers.
     *
     * @param covers the covers
     */
    public void setCovers(List<Integer> covers){
		this.covers = covers;
	}

    /**
     * Get covers list.
     *
     * @return the list
     */
    public List<Integer> getCovers(){
		return covers;
	}

    /**
     * Set local id.
     *
     * @param localId the local id
     */
    public void setLocalId(List<String> localId){
		this.localId = localId;
	}

    /**
     * Get local id list.
     *
     * @return the list
     */
    public List<String> getLocalId(){
		return localId;
	}

    /**
     * Set languages.
     *
     * @param languages the languages
     */
    public void setLanguages(List<LanguagesItem> languages){
		this.languages = languages;
	}

    /**
     * Get languages list.
     *
     * @return the list
     */
    public List<LanguagesItem> getLanguages(){
		return languages;
	}

    /**
     * Set identifiers.
     *
     * @param identifiers the identifiers
     */
    public void setIdentifiers(Identifiers identifiers){
		this.identifiers = identifiers;
	}

    /**
     * Get identifiers identifiers.
     *
     * @return the identifiers
     */
    public Identifiers getIdentifiers(){
		return identifiers;
	}

    /**
     * Set created.
     *
     * @param created the created
     */
    public void setCreated(Created created){
		this.created = created;
	}

    /**
     * Get created created.
     *
     * @return the created
     */
    public Created getCreated(){
		return created;
	}

    /**
     * Set subjects.
     *
     * @param subjects the subjects
     */
    public void setSubjects(List<String> subjects){
		this.subjects = subjects;
	}

    /**
     * Get subjects list.
     *
     * @return the list
     */
    public List<String> getSubjects(){
		return subjects;
	}

    /**
     * Set source records.
     *
     * @param sourceRecords the source records
     */
    public void setSourceRecords(List<String> sourceRecords){
		this.sourceRecords = sourceRecords;
	}

    /**
     * Get source records list.
     *
     * @return the list
     */
    public List<String> getSourceRecords(){
		return sourceRecords;
	}

    /**
     * Set revision.
     *
     * @param revision the revision
     */
    public void setRevision(int revision){
		this.revision = revision;
	}

    /**
     * Get revision int.
     *
     * @return the int
     */
    public int getRevision(){
		return revision;
	}

    /**
     * Set classifications.
     *
     * @param classifications the classifications
     */
    public void setClassifications(Classifications classifications){
		this.classifications = classifications;
	}

    /**
     * Get classifications classifications.
     *
     * @return the classifications
     */
    public Classifications getClassifications(){
		return classifications;
	}

    /**
     * Set publish date.
     *
     * @param publishDate the publish date
     */
    public void setPublishDate(String publishDate){
		this.publishDate = publishDate;
	}

    /**
     * Get publish date string.
     *
     * @return the string
     */
    public String getPublishDate(){
		return publishDate;
	}

    /**
     * Set latest revision.
     *
     * @param latestRevision the latest revision
     */
    public void setLatestRevision(int latestRevision){
		this.latestRevision = latestRevision;
	}

    /**
     * Get latest revision int.
     *
     * @return the int
     */
    public int getLatestRevision(){
		return latestRevision;
	}

    /**
     * Set authors.
     *
     * @param authors the authors
     */
    public void setAuthors(List<AuthorsItem> authors){
		this.authors = authors;
	}

    /**
     * Get authors list.
     *
     * @return the list
     */
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