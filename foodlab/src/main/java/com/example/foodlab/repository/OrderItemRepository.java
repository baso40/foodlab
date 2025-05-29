package com.example.foodlab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodlab.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{

}
