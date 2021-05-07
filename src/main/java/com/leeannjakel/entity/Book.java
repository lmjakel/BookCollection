package com.leeannjakel.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Book.
 * @author LeeAnn Jakel
 */
@Entity(name="Book")
@Table(name="book")

/**
 * Lombok
 */
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "title")
    @NonNull
    private String title;

    @Column(name = "isbn")
    @NonNull
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "author_id")
    @NonNull
    private Author author;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @NonNull
    private User user;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    @NonNull
    private Genre genre;

    @Column(name = "notes")
    @NonNull
    private String notes;
}
