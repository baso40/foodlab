package com.example.foodlab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodlab.entity.Category;

public interface CategoryRepositoy extends JpaRepository<Category,Long>{

}
