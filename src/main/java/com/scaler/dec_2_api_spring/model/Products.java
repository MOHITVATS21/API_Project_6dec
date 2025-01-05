package com.scaler.dec_2_api_spring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Products extends BaseModel{



    private String title;
    private String description;
    private String image;

    private Double price;
    @ManyToOne
    private Categories category;




}
