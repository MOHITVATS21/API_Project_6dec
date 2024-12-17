package com.scaler.dec_2_api_spring.repository;

import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Categoryrepo extends JpaRepository<Category, Long> {

    //Get all categories

    //Get category by id

    //Add category

    //Update category

    //Delete category

    Category findByName (String Name);
}
