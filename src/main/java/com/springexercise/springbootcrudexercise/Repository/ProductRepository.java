package com.springexercise.springbootcrudexercise.Repository;

import com.springexercise.springbootcrudexercise.Domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
