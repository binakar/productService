package com.example.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequestDTO {

    private String title;
    private double price;
    private String category;
    private String  description;
    private String image;
}
