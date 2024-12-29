package com.scaler.dec_2_api_spring.service;

import com.scaler.dec_2_api_spring.Exceptions.ProductNotFoundException;
import com.scaler.dec_2_api_spring.model.Categories;
import com.scaler.dec_2_api_spring.model.Products;
import com.scaler.dec_2_api_spring.repository.Categoryrepo;
import com.scaler.dec_2_api_spring.repository.ProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("DBservice")
public class DBservice implements ProductService{


    private final NamedParameterJdbcOperations namedParameterJdbcOperations;
    private ProductRepo productRepo;
    private Categoryrepo categoryrepo;

    public DBservice(ProductRepo productRepo, Categoryrepo categoryrepo, NamedParameterJdbcOperations namedParameterJdbcOperations) {
        this.productRepo = productRepo;
        this.categoryrepo = categoryrepo;
        this.namedParameterJdbcOperations = namedParameterJdbcOperations;
    }



    @Override
    @Transactional
    public Products addProduct(Long id, String title, String description, String image, Double price, String category) {
        Products p=new Products();
        Optional<Categories> currentcat=  categoryrepo.findByName(category);
        if(currentcat.isEmpty())
        {
            Categories newcat=new Categories();
            newcat.setName(category);
            Categories newrow=categoryrepo.save(newcat);
            p.setCategory(newrow);
        }
        else {
            p.setCategory(currentcat.get());
        }
        p.setTitle(title);
        p.setDescription(description);
        p.setImage(image);
        p.setPrice(price);

        return productRepo.save(p);
    }

    @Override
    public List<Products> getProducts() {
        return List.of();
    }

    @Override
    public Products getsingleProduct(Long id) throws ProductNotFoundException {
        Optional<Products> p = productRepo.findById(id);
        if (p.isPresent()) {
            return p.get();
        } else {
            throw new ProductNotFoundException("Product with ID " + id + " not found");
        }
    }

    @Override
    @Transactional
    public String deleteProduct(Long id) {
        Optional<Products> p = productRepo.findById(id);
        if (p.isEmpty()) {
            return "Product with ID " + id + " not found";
        }
        else {
            productRepo.deleteById(id);
            return "deleted";
        }

    }

    @Override
    public Products updateProduct(Products product) {
        return null;
    }

}
