package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name="Genre")
@Table(name="genre")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name="name")
    private String name;


}
