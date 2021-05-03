package com.leeannjakel.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Author.
 */
@Entity(name="Author")
@Table(name="author")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;

	@Column (name= "name")
	private String name;

	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private Set<Book> books = new HashSet<>();

	/**
	 * Instantiates a new Author.
	 */
	public Author() {
	}

	/**
	 * Instantiates a new Author.
	 *
	 * @param name the name
	 */
	public Author(String name) {
		this.name = name;
	}

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name.
	 *
	 * @param name the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets books.
	 *
	 * @return the books
	 */
	public Set<Book> getBooks() {
		return books;
	}

	/**
	 * Sets books.
	 *
	 * @param books the books
	 */
	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
