package com.scaler.dec_2_api_spring.service;

import com.scaler.dec_2_api_spring.model.Products;

import java.util.List;

public interface ProductService {
    Products addProduct(Products product);

    List<Products> getProducts();

    Products getProduct(Long id);
}
