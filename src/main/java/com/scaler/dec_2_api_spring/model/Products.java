package com.scaler.dec_2_api_spring.model;

public class Products {

    private Long id;
    private String title;
    private String description;
    private String imageurl;
    private Double price;
    private Long category_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public Products() {
    }

    public Products(Long id, String title, String description, String imageurl, Double price, Long category_id) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageurl = imageurl;
        this.price = price;
        this.category_id = category_id;
    }
}
