package com.leeannjakel.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Book.
 */
@Entity(name="Book")
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="isbn")
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    /**
     * Instantiates a new Book.
     */
    public Book() {
    }

    /**
     * Instantiates a new Book.
     *
     * @param title  the title
     * @param isbn   the isbn
     * @param author the author
     * @param user   the user
     * @param genre  the genre
     */
    public Book(String title, String isbn, Author author, User user, Genre genre) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.user = user;
        this.genre = genre;
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
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets isbn.
     *
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets isbn.
     *
     * @param isbn the isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Gets author.
     *
     * @return the author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Sets author.
     *
     * @param author the author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets genre.
     *
     * @return the genre
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Sets genre.
     *
     * @param genre the genre
     */
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author=" + author +
                ", user=" + user +
                ", genre=" + genre +
                '}';
    }
}
