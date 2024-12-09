package com.scaler.dec_2_api_spring.controller;

import com.scaler.dec_2_api_spring.model.Products;
import com.scaler.dec_2_api_spring.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductApi {


    private ProductService productService;

    public ProductApi(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    private void addProduct(Products product) {

    }

    @GetMapping("/products/{id}")
    private Products getProduct(@PathVariable Long id) {
        productService.getProduct(id);
        System.out.println("did it");
        return  null;
    }

    @GetMapping("/products")
    private List<Products> getProducts(Products products) {
        return  null;
    }



    @PutMapping("/products")
    private void updateProduct(Products product) {

    }

    @DeleteMapping("/products")
    private void deleteProduct(Long id) {

    }


}
