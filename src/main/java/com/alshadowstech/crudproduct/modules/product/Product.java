package com.alshadowstech.crudproduct.modules.product;

import com.alshadowstech.crudproduct.entity.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "products")
@Data
public class Product extends AbstractEntity {
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    private double price;
}
