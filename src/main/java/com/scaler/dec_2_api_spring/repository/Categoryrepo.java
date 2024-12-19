package com.scaler.dec_2_api_spring.repository;

import com.scaler.dec_2_api_spring.controller.CategoriesApi;
import com.scaler.dec_2_api_spring.model.Categories;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Categoryrepo extends JpaRepository<Categories, Long> {

    //Get all categories

    //Get category by id

    //Add category

    //Update category

    //Delete category

    Optional<Categories> findByName (String Name);
}
