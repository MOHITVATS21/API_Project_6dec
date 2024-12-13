package com.scaler.dec_2_api_spring.service;

import com.scaler.dec_2_api_spring.Exceptions.ProductNotFoundException;
import com.scaler.dec_2_api_spring.FakestoreDTO.FakestoreDto;
import com.scaler.dec_2_api_spring.model.Products;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class FakestoreService implements ProductService {


    private RestTemplate restTemplate;

    public FakestoreService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public Products addProduct(Long id, String title, String description, String image, Double price, String category) {
        FakestoreDto fakestoreDto = new FakestoreDto();
        fakestoreDto.setId(id);
        fakestoreDto.setTitle(title);
        fakestoreDto.setPrice(price);
        fakestoreDto.setDescription(description);
        fakestoreDto.setImage(image);
        fakestoreDto.setCategory(category);

        FakestoreDto response = restTemplate.postForObject("https://fakestoreapi.com/products",fakestoreDto,FakestoreDto.class);
        return response.getProduct();
    }



    public List<FakestoreDto> getProducts() {
        List<FakestoreDto> products = restTemplate.getForObject("https://fakestoreapi.com/products", List.class);


        return products;
    }



    public Products getsingleProduct(Long id) throws ProductNotFoundException {
        System.out.println("we got the single product");
        FakestoreDto fakestoreDto= restTemplate.getForObject("https://fakestoreapi.com/products/"+id,
                FakestoreDto.class);
        //System.out.println(restTemplate.getForObject("https://fakestoreapi.com/products/" +(1),FakestoreDto.class));
        //System.out.println("FakeStore DTO::"+fakestoreDto.toString());

        if(fakestoreDto==null){
            throw new ProductNotFoundException("Product not found with id "+id);
        }
        return fakestoreDto.getProduct();
    }



    @Override
    public String deleteProduct(Long id) {

        restTemplate.delete("https://fakestoreapi.com/products/"+id);

        return "delete successful";
    }



    @Override
    public Products updateProduct(Long id, String title, String description, String image, Double price, String category) {

        FakestoreDto fakestoreDto = new FakestoreDto();
        fakestoreDto.setId(id);
        fakestoreDto.setTitle(title);
        fakestoreDto.setPrice(price);
        fakestoreDto.setDescription(description);
        fakestoreDto.setImage(image);
        fakestoreDto.setCategory(category);
        HttpEntity<FakestoreDto> requestentity=new HttpEntity<>(fakestoreDto);
        ResponseEntity<FakestoreDto> response=restTemplate.exchange("https://fakestoreapi.com/products"+id, HttpMethod.PUT,requestentity,FakestoreDto.class);
        return response.getBody().getProduct();
    }
}
