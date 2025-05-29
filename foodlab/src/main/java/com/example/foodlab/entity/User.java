package com.example.foodlab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue()
	private Long id;
	
	@NotBlank
	private String name;
	
	@Email
	private String email;
	
	private Integer phone;
	
	@NotBlank
	private Integer address;
	
}
