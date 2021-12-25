package com.example.marketplace.Product.configuration;

import com.example.marketplace.Product.entity.Product;
import com.example.marketplace.Product.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProductConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            Product phone = new Product(
                    "SamsungA50",
                    "phone",
                    30
            );

            Product car = new Product(
                    "Kia K5",
                    "car",
                    10
            );
            productRepository.saveAll(
                    List.of(car,phone)
            );
        };
    }
}
