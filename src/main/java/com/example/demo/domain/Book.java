package com.example.demo.domain;

import java.time.*;

import lombok.*;

@Data
public class Book {
	private String title;
	private Integer price;
	private Double weight;
	private LocalDate published;
	private LocalDateTime updated;
}
