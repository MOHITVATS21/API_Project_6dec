package com.scaler.dec_2_api_spring.repository;

import com.scaler.dec_2_api_spring.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepo extends JpaRepository<Products, Integer> {

    //Get all products

    //Get product by id

    //Add product

    //Update product

    //Delete product

    Optional<Products> findByDescription(String description);

    Optional<Products> findById(Long id);
}
