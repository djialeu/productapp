package com.alshadowstech.crudproduct.modules.security.authority;

import com.alshadowstech.crudproduct.entity.AbstractEntity;
import com.alshadowstech.crudproduct.modules.security.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "authorities")
@Data
public class Authority extends AbstractEntity {

    @Column(nullable = false, unique = true)
    private String name;

}
