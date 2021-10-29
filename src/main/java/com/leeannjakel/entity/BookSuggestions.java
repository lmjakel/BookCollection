package com.leeannjakel.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Book Suggestions.
 *
 * @author LeeAnn Jakel
 */
@Entity(name="BookSuggestions")
@Table(name="bookSuggestions")

/**
 * Lombok
 */
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class BookSuggestions {

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
    @JoinColumn(name = "genre_id")
    @NonNull
    private Genre genre;

    @Column(name = "description")
    @NonNull
    private String description;

}
