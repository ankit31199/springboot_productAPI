package com.spring.springboot_api.Repositories;

import com.spring.springboot_api.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<Product,Integer> {
}
