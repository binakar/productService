package com.example.productservice.controller;

import com.example.productservice.dtos.CreateProductRequestDTO;
import com.example.productservice.model.Product;
import com.example.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductRequestDTO request) {

        return  productService.createProduct(request.getTitle(),request.getPrice(),request.getCategory(), request.getDescription(), request.getImage());

    }

    @GetMapping("/products")
    public void getAllProducts()
    {

    }
    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long productId)
    {
        return  productService.getSingleProduct(productId);
    }

}
