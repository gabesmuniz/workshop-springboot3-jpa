package com.udemy.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.cursojava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
