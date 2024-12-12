package com.scaler.dec_2_api_spring.model;

public class Products {

    private Long id;
    private String title;
    private String description;
    private String image;

    private Double price;
    private Categories category;

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }





    public Products() {
        System.out.println("I am called");

    }

    public Products(Long id, String title, String description, String image, Double price, Categories category) {
        System.out.println("he is not called");
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.price = price;
        this.category = category;
    }


    public String toString() {
        return "Products{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }


}
