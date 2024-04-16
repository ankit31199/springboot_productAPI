package com.spring.springboot_api.Services;

import com.spring.springboot_api.Entities.Product;

import java.util.List;

public interface productService {

    Product create(Product  product);
    Product update(Product product,int productId);
    void delete(int productId);
    Product getbyId(int productId);
    List<Product> getAll();
}
