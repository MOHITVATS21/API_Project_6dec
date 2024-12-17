package com.scaler.dec_2_api_spring.model;

import jakarta.persistence.Entity;

@lombok.Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@Entity
public class Categories extends BaseModel{

    private String name;


}
