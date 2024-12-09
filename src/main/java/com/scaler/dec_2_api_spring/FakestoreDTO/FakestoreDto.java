package com.scaler.dec_2_api_spring.FakestoreDTO;

import com.scaler.dec_2_api_spring.model.Products;
import com.scaler.dec_2_api_spring.model.Categories;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakestoreDto {
    private Long id;
    private String title;
    private Double price;
    private String description;
    private String category;


    public Products getProducts() {
        Products products = new Products();
        products.setId(id);
        products.setTitle(title);
        products.setPrice(price);
        products.setDescription(description);

        Categories category = new Categories();
        category.setName(category.getName());
        products.setCategory_id(category.getId());
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