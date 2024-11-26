package com.example.productservice.dtos;

import com.example.productservice.model.Category;
import com.example.productservice.model.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDTO {

    private Long id;
    private String title;
    private double price;
    private String category;
    private String  description;
    private String image;

    public Product toProduct()
    {
        Product product=new Product();
        product.setId(id);
        product.setTitle(title);
        product.setPrice(price);
        product.setDescription(description);
        product.setImageUrl(image);
        Category cate=new Category();
        cate.setTitle(category);
        product.setCategory(cate);

        return product;
    }
}
