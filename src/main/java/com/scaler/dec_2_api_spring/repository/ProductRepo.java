package com.scaler.dec_2_api_spring.repository;

import com.scaler.dec_2_api_spring.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Products, Integer> {

    //Get all products

    //Get product by id

    //Add product

    //Update product

    //Delete product

    Products findProductsByDescription(String description);
}
