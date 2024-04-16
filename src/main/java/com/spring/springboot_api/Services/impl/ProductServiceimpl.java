package com.spring.springboot_api.Services.impl;

import com.spring.springboot_api.Services.productService;
import com.spring.springboot_api.Repositories.productRepository;
import com.spring.springboot_api.Entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceimpl implements productService {

    private productRepository productRepository;

    @Autowired
    public ProductServiceimpl(com.spring.springboot_api.Repositories.productRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Product update(Product product, int productId) {

        Product product1=this.productRepository.findById(productId).orElseThrow(()-> new RuntimeException("Not Found"));
        product1.setAbout(product.getAbout());
        product1.setPrice(product.getPrice());
        product1.setName(product.getName());

        Product save=this.productRepository.save(product1);

        return save;

    }

    @Override
    public void delete(int productId) {

        Product product1=this.productRepository.findById(productId).orElseThrow(()-> new RuntimeException("Not Found"));
        this.productRepository.delete(product1);


    }

    @Override
    public Product getbyId(int productId) {
        Product product1=this.productRepository.findById(productId).orElseThrow(()-> new RuntimeException("Not Found"));

        return product1;
    }

    @Override
    public List<Product> getAll() {

        List<Product> allProduct=this.productRepository.findAll();


        return allProduct;
    }
}
