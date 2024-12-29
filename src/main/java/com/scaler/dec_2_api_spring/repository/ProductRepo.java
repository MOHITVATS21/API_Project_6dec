package com.scaler.dec_2_api_spring.repository;

import com.scaler.dec_2_api_spring.model.Products;
import com.scaler.dec_2_api_spring.repository.Projections.productproj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepo extends JpaRepository<Products, Integer> {

    //Get all products

    //Get product by id

    //Add product

    //Update product

    //Delete product

    Optional<Products> findByDescription(String description);

    Optional<Products> findById(Long id);

    Optional<Products> deleteById(Long id);

    //Implement HQL query to get all products by category id
    @Query("select p from Products p where p.category.id=:categoryId")
    List<Products> findProductsByCategoryId(@Param("categoryId")Long categoryId);

    //Implement Native query to get all products by category name
    @Query(value = "select * from products p where category_id=:categoryId" , nativeQuery = true)
    List<Products> findProductsByNativeCategoryId(@Param("categoryId")Long categoryId);

    @Query("select p.title as title , p.id as id  from Products p where p.category.id=:categoryId")
    List<productproj> findProductsByCategoryIdusingProject(@Param("categoryId")Long categoryId);

}

