package com.example.marketplace.Product.service;

import com.example.marketplace.Product.entity.Product;
import com.example.marketplace.Product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServices {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServices(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProduct(){
       return productRepository.findAll();
    }

    public void addNewProduct(Product product) {
        System.out.println(product);
    }
}
