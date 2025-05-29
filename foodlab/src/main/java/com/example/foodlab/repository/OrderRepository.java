package com.example.foodlab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodlab.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{
	
}
