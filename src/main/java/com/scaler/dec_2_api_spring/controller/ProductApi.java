package com.scaler.dec_2_api_spring.controller;

import com.scaler.dec_2_api_spring.Exceptions.ProductNotFoundException;
import com.scaler.dec_2_api_spring.Exceptions.ProductNotFoundException;
import com.scaler.dec_2_api_spring.FakestoreDTO.ErrorDTO;
import com.scaler.dec_2_api_spring.FakestoreDTO.FakestoreDto;
import com.scaler.dec_2_api_spring.model.Products;
import com.scaler.dec_2_api_spring.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductApi {


    private ProductService productService;

    public ProductApi(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    private Products addProduct(@RequestBody Products product) {
    Products p=productService.addProduct(product.getId(),product.getTitle()
    ,product.getDescription(),product.getImage(),product.getPrice(),product.getCategory().getName());

    return p;

    }

    @GetMapping("/products/{id}")
    private ResponseEntity<Products> getProductbyID(@PathVariable("id") Long id) throws ProductNotFoundException {
        System.out.println("let's start");
        Products p=productService.getsingleProduct(id);
        System.out.println("did it");

        ResponseEntity<Products> response=new ResponseEntity(p, HttpStatus.OK);

        return  response;
    }

    @GetMapping("/products")
    private List<Products> getProducts(Products products) {
        return  null;
    }



    @PutMapping("/products")
    private String updateProduct(Products product) {
        return "done update";

    }

    @DeleteMapping("/products/{id}")
    private String deleteProduct(@PathVariable Long id) {
        System.out.println("delete is successful");
        productService.deleteProduct(id);
        return "you did it the delete";

    }

    @ExceptionHandler(ProductNotFoundException.class)
    private ResponseEntity<ErrorDTO> handleProductNotFound(Exception e) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setMessage(e.getMessage());

        ResponseEntity<ErrorDTO> response=new ResponseEntity(errorDTO, HttpStatus.NOT_FOUND);

        return  response;


    }


}
