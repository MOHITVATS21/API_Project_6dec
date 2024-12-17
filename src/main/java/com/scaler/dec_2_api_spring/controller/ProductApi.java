package com.scaler.dec_2_api_spring.controller;

import com.scaler.dec_2_api_spring.Exceptions.ProductNotFoundException;
import com.scaler.dec_2_api_spring.FakestoreDTO.ErrorDTO;
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


    //Post API to add a product
    @PostMapping("/products")
    private Products addProduct(@RequestBody Products product) {
    Products p=productService.addProduct(product.getId(),product.getTitle()
    ,product.getDescription(),product.getImage(),product.getPrice(),product.getCategory().getName());

    return p;

    }


    //Get API to get a product by ID
    @GetMapping("/products/{id}")
    private ResponseEntity<Products> getProductbyID(@PathVariable("id") Long id) throws ProductNotFoundException {
        System.out.println("let's start");
        Products p=productService.getsingleProduct(id);
        System.out.println("did it");

        ResponseEntity<Products> response=new ResponseEntity(p, HttpStatus.OK);

        return  response;
    }

    //Get API to get all products
    @GetMapping("/products")
    private ResponseEntity<Products> getProducts() {
        System.out.println("Starting the Get all Products API here");
        List<Products> p = productService.getProducts();
        System.out.println("Ending the Get All products API");

        ResponseEntity<Products> response=new ResponseEntity(p, HttpStatus.OK);
        return  response;
    }

    //Put API to update a product
    @PutMapping("/products")
    private Products updateProduct(@RequestBody Products product) {
        Products p=productService.updateProduct(product);

        return p;


    }

    //Delete API to delete a product
    @DeleteMapping("/products/{id}")
    private String deleteProduct(@PathVariable Long id) {
        System.out.println("delete is successful");
        productService.deleteProduct(id);
        return HttpStatus.NO_CONTENT.toString();

    }

    //Exception handling for ProductNotFoundException
    @ExceptionHandler(ProductNotFoundException.class)
    private ResponseEntity<ErrorDTO> handleProductNotFound(Exception e) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setMessage(e.getMessage());

        ResponseEntity<ErrorDTO> response=new ResponseEntity(errorDTO, HttpStatus.NOT_FOUND);

        return  response;


    }


}
