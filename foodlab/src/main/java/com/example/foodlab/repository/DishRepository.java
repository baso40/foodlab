package com.example.foodlab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodlab.entity.Dish;

public interface DishRepository extends JpaRepository<Dish,Long> {

}
