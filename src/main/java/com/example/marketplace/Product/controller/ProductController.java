package com.example.marketplace.Product.controller;

import com.example.marketplace.Product.entity.Product;
import com.example.marketplace.Product.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/product")
public class ProductController {

    private final ProductServices productServices;

    @Autowired
    public ProductController(ProductServices productServices){
        this.productServices=productServices;
    }
    @GetMapping
    public List<Product> getProduct(){
        return productServices.getProduct();
    }

    @PostMapping
    public void registerNewProduct(@RequestBody Product product){
        productServices.addNewProduct(product);
    }
}
