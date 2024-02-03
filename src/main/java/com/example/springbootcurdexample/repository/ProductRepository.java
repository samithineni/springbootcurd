package com.example.springbootcurdexample.repository;

import com.example.springbootcurdexample.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
