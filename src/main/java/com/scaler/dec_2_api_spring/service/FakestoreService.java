package com.scaler.dec_2_api_spring.service;

import com.scaler.dec_2_api_spring.Exceptions.ProductNotFoundException;
import com.scaler.dec_2_api_spring.FakestoreDTO.FakestoreDto;
import com.scaler.dec_2_api_spring.model.Products;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
public class FakestoreService implements ProductService {


    private RestTemplate restTemplate;

    public FakestoreService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    //Add product logic
    @Override
    public Products addProduct(Long id, String title, String description, String image, Double price, String category) {
//        FakestoreDto fakestoreDto = new FakestoreDto();
//        fakestoreDto.setId(id);
//        fakestoreDto.setTitle(title);
//        fakestoreDto.setPrice(price);
//        fakestoreDto.setDescription(description);
//        fakestoreDto.setImage(image);
//        fakestoreDto.setCategory(category);
//
//        FakestoreDto response = restTemplate.postForObject("https://fakestoreapi.com/products",fakestoreDto,FakestoreDto.class);
//        return response.getProduct();

        return null;
    }


    //Get all products logic
    public List<Products> getProducts() {
//        FakestoreDto[] fakeStoreListOfProducts =
//                restTemplate.getForObject("https://fakestoreapi.com/products/",
//                        FakestoreDto[].class);
//        List<Products> listOfProducts = new ArrayList<>();
//        for (FakestoreDto fakeStoreListOfProduct : fakeStoreListOfProducts) {
//            listOfProducts.add(fakeStoreListOfProduct.getProduct());
//        }
//
//        return listOfProducts;

        return null;

    }

    //Get single product logic
    public Products getsingleProduct(Long id) throws ProductNotFoundException {
//        System.out.println("we got the single product");
//
//        FakestoreDto fakestoreDto= restTemplate.getForObject("https://fakestoreapi.com/products/"+id,FakestoreDto.class);
//
//        System.out.println("FakeStore DTO::"+fakestoreDto.toString());
//
//        if(fakestoreDto==null){
//            throw new ProductNotFoundException("Product not found with id "+id);
//        }
//        return fakestoreDto.getProduct();

        return null;
    }


    //Delete product logic
    @Override
    public String deleteProduct(Long id) {

//        restTemplate.delete("https://fakestoreapi.com/products/"+id);
//
//        return "delete successful";

        return null;
    }

    //Update product logic
    @Override
    public Products updateProduct(Products product) {

//        FakestoreDto fakestoreDto = new FakestoreDto();
//        fakestoreDto.setId(product.getId());
//        fakestoreDto.setTitle(product.getTitle());
//        fakestoreDto.setPrice(product.getPrice());
//        fakestoreDto.setDescription(product.getDescription());
//        fakestoreDto.setImage(product.getImage());
//        fakestoreDto.setCategory(product.getCategory().getName());
//        HttpEntity<FakestoreDto> requestentity=new HttpEntity<>(fakestoreDto);
//        ResponseEntity<FakestoreDto> response=restTemplate.exchange("https://fakestoreapi.com/products/"+product.getId(), HttpMethod.PUT,requestentity,FakestoreDto.class);
//        return response.getBody().getProduct();

        return null;
    }
}
