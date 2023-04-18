package com.udemy.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.cursojava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
