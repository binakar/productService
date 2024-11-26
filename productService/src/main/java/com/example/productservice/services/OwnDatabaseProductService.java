package com.example.productservice.services;

import com.example.productservice.dtos.CreateProductRequestDTO;
import com.example.productservice.model.Product;

import java.util.List;

public class OwnDatabaseProductService implements ProductService{


    @Override
    public Product getSingleProduct(Long id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(String title, Double price, String category, String description, String image) {
        return null;
    }
}
