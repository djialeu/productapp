package com.alshadowstech.crudproduct.fixtures;

import com.alshadowstech.crudproduct.modules.product.Product;
import com.alshadowstech.crudproduct.modules.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("dev")
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Product ballon = new Product();
        ballon.setDescription("Ballon de football");
        ballon.setName("Football");
        ballon.setPrice(12000);
        productRepository.save(ballon);
    }
}

