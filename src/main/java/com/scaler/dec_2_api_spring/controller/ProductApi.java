package com.scaler.dec_2_api_spring.controller;

import com.scaler.dec_2_api_spring.model.Products;
import com.scaler.dec_2_api_spring.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductApi {

    private ProductService productService;

    public ProductApi(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    private void addProduct(Products product) {

    }

    @GetMapping("/products")
    private Products getProducts(Long id) {
        return  null;
    }



    @PutMapping("/products")
    private void updateProduct(Products product) {

    }

    @DeleteMapping("/products")
    private void deleteProduct(Long id) {

    }


}
