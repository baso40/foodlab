package com.example.foodlab.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "dish")
public class Dish {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String name;
	
	private String description;
	
	@DecimalMin(value = "0.0", inclusive = false)
	private BigDecimal price;
	
	private Integer stockQuantity;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category Category;
	
	@ManyToOne
	@JoinColumn(name = "restraunt_id")
	private Restaurant restraunt;

}
