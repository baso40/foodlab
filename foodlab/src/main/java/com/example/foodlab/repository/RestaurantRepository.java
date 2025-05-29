package com.example.foodlab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodlab.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {

}
