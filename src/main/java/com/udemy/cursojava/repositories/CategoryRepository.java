package com.udemy.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.cursojava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
