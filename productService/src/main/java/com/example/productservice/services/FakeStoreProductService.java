package com.example.productservice.services;

import com.example.productservice.dtos.CreateProductRequestDTO;
import com.example.productservice.dtos.FakeStoreProductDTO;
import com.example.productservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class FakeStoreProductService implements ProductService {

    @Autowired
    public RestTemplate restTemplate ;


    @Override
    public Product  getSingleProduct(Long id) {

        FakeStoreProductDTO fakeStoreProductDTO =
                restTemplate.getForEntity("https://fakestoreapi.com/products/" + id, FakeStoreProductDTO.class).getBody();
        return fakeStoreProductDTO.toProduct() ;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(String title, Double price, String category, String description, String image) {
        FakeStoreProductDTO fakeStoreProductDTO=new FakeStoreProductDTO();
        fakeStoreProductDTO.setTitle(title);
        fakeStoreProductDTO.setPrice(price);
        fakeStoreProductDTO.setCategory(category);
        fakeStoreProductDTO.setDescription(description);
        fakeStoreProductDTO.setImage(image);
        FakeStoreProductDTO response= restTemplate.postForObject("https://fakestoreapi.com/products", fakeStoreProductDTO, FakeStoreProductDTO.class);

        return response.toProduct();
    }


}
