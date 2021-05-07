package com.leeannjakel.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * The type User.
 * @author LeeAnn Jakel
 */
@Entity(name="User")
@Table(name="user")

/**
 * Lombok
 */
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name="first_name")
    @NonNull
    private String firstName;

    @Column(name="last_name")
    @NonNull
    private String lastName;

    @Column(name= "user_name")
    @NonNull
    private String userName;

    @Column(name="password")
    @NonNull
    private String password;

    @Column(name="email")
    @NonNull
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<Book> books = new HashSet<>();

    /**
     * Add role.
     *
     * @param role the role
     */
    public void addRole(Role role) {
        roles.add(role);
        role.setUser(this);
    }

    /**
     * Remove role.
     *
     * @param role the role
     */
    public void removeRole(Role role) {
        roles.remove(role);
        role.setUser(null);
    }

    /**
     * Add book.
     *
     * @param book the book
     */
    public void addBook (Book book) {
        books.add(book);
        book.setUser(this);
    }

    /**
     * Remove book.
     *
     * @param book the book
     */
    public void removeBook (Book book) {
        books.remove(book);
        book.setUser(null);
    }

}
