package com.example.project1.repository;

import com.example.project1.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
