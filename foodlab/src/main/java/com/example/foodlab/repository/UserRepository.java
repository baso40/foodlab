package com.example.foodlab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.foodlab.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
	

}
