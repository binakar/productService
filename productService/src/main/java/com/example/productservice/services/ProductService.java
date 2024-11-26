package com.example.productservice.services;

import com.example.productservice.dtos.CreateProductRequestDTO;
import com.example.productservice.dtos.FakeStoreProductDTO;
import com.example.productservice.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {

    Product getSingleProduct(Long id);

    List<Product> getAllProducts();
    Product createProduct(String title, Double price, String category, String description, String image);

}
