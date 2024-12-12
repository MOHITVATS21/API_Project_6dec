package com.scaler.dec_2_api_spring.FakestoreDTO;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.scaler.dec_2_api_spring.model.Products;
import com.scaler.dec_2_api_spring.model.Categories;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//@Getter
//@Setter
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class FakestoreDto {

   // @JsonProperty("id")
    private Long id;

   // @JsonProperty("title")
    private String title;


    private Double price;

    private String description;

    private String category;

    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Products getProduct() {
        // Create a new Products object
        Products products = new Products();

        // Set the fields from the FakestoreDto instance
        products.setId(id);
        products.setTitle(title);
        products.setPrice(price);
        products.setDescription(description);
        products.setImage(image);
        //System.out.println("Product store data ::"+products.toString());

        Categories cat = new Categories();
        cat.setName(category);
        //System.out.println(category);
        products.setCategory(cat);
        return products;
    }
}




//{
//    "id":1,
//        "title":"Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
//        "price":109.95,
//        "description":"Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
//        "category":"men's clothing",
//        "image":"https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
//        "rating":
//        {
//         "rate":3.9,"count":120}}