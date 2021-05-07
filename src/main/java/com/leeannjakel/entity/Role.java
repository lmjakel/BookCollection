package com.leeannjakel.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

/**
 * A javabean class to represent a role.
 *
 * @author LeeAnn Jakel
 */
@Entity(name = "Role")
@Table(name = "role")
/**
 * Lombok
*/
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @ManyToOne
    @NonNull
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "user_id"))
    private User user;

    @Column(name = "role_name")
    @NonNull
    private String roleName;

    @Column(name = "user_name")
    @NonNull
    private String userName;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return id == role.id &&
                Objects.equals(userName, role.userName) &&
                Objects.equals(roleName, role.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleName, userName);
    }
}
