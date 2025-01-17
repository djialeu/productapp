package com.alshadowstech.crudproduct.modules.security.user;

import com.alshadowstech.crudproduct.entity.AbstractEntity;
import com.alshadowstech.crudproduct.modules.security.authority.Authority;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "users")
@Data
public class User extends AbstractEntity {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @ManyToMany()
    @JoinTable(
            name = "user_authority",
            joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "authority", referencedColumnName = "id") }
    )
    private Set<Authority> authorities;
}
