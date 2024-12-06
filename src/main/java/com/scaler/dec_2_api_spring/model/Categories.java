package com.scaler.dec_2_api_spring.model;

public class Categories {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Categories() {
    }

    public Categories(String name, Long id) {
        this.name = name;
        this.id = id;
    }
}
