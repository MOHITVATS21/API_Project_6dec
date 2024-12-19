package com.scaler.dec_2_api_spring.service;

import com.scaler.dec_2_api_spring.Exceptions.ProductNotFoundException;
import com.scaler.dec_2_api_spring.model.Categories;
import com.scaler.dec_2_api_spring.model.Products;
import com.scaler.dec_2_api_spring.repository.Categoryrepo;
import com.scaler.dec_2_api_spring.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("DBservice")
public class DBservice implements ProductService{



    private ProductRepo productRepo;
    private Categoryrepo categoryrepo;

    public DBservice(ProductRepo productRepo, Categoryrepo categoryrepo) {
        this.productRepo = productRepo;
        this.categoryrepo = categoryrepo;
    }



    @Override
    public Products addProduct(Long id, String title, String description, String image, Double price, String category) {
        Products p=new Products();
        Optional<Categories> currentcat=  categoryrepo.findByName(category);
        if(currentcat.isEmpty())
        {
            Categories newcat  =new Categories();
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
    public String deleteProduct(Long id) {
        return "";
    }

    @Override
    public Products updateProduct(Products product) {
        return null;
    }

}
