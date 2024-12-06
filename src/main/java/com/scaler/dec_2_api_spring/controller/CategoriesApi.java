package com.scaler.dec_2_api_spring.controller;

import com.scaler.dec_2_api_spring.model.Categories;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class CategoriesApi {

    @PostMapping("/categories")
    private void addCategory(Categories category) {

    }
    @GetMapping("/categories")
    private Categories getCategory(Long id) {
        return null;
    }
    @PutMapping("/categories")
    private void updateCategory(Categories category) {
    }
    @DeleteMapping("/categories")
    private void deleteCategory(Long id) {
    }
}
