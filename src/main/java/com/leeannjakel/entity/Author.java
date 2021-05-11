package com.leeannjakel.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type Author.
 * @author LeeAnn Jakel
 */
@Entity(name="Author")
@Table(name="author")

/**
 * Lombok
 */
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;

	@Column (name= "name")
	@NonNull
	private String name;

	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	private Set<Book> books = new HashSet<>();

}
