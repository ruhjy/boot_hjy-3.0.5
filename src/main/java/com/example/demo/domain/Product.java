package com.example.demo.domain;

import lombok.*;

@Data
public class Product {
	private String name;
	private String unit;
	private Double price;
	
	private Integer quantity;
	private Double sum;
}
