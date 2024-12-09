package com.scaler.dec_2_api_spring.service;

import com.scaler.dec_2_api_spring.model.Products;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FakestoreService implements ProductService {


    @Override
    public Products addProduct(Products product) {
        return null;
    }

    @Override
    public List<Products> getProducts() {
        return null;
    }

    @Override
    public Products getProduct(Long id) {
        return null;
    }
}
