package com.alshadowstech.crudproduct.modules.product;

import lombok.Data;

@Data
public class ProductDto {
    private String name;
    private String description;
    private double price;

    public Product toProduct() {
        Product product = new Product();
        product.setName(this.name);
        product.setDescription(this.description);
        product.setPrice(this.price);
        return product;
    }
}

