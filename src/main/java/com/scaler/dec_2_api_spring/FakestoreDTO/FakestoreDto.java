package com.scaler.dec_2_api_spring.FakestoreDTO;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import com.scaler.dec_2_api_spring.model.Products;
import com.scaler.dec_2_api_spring.model.Categories;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
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



//    public Products getProduct() {
//        // Create a new Products object
//        Products products = new Products();
//
//        // Set the fields from the FakestoreDto instance
//        products.setId(id);
//        products.setTitle(title);
//        products.setPrice(price);
//        products.setDescription(description);
//        products.setImage(image);
//        //System.out.println("Product store data ::"+products.toString());
//
//        Categories cat = new Categories();
//        cat.setName(category);
//        products.setCategory(cat);
//        return products;
//    }
}
