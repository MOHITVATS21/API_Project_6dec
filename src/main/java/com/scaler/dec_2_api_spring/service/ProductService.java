package com.scaler.dec_2_api_spring.service;

import com.scaler.dec_2_api_spring.Exceptions.ProductNotFoundException;
import com.scaler.dec_2_api_spring.model.Products;

import java.util.List;

public interface ProductService {
    Products addProduct(Long id, String title, String description, String image, Double price, String category);

    List<Products> getProducts();

    Products getsingleProduct(Long id) throws ProductNotFoundException;

    String deleteProduct(Long id);

    Products updateProduct(Products product);


}
