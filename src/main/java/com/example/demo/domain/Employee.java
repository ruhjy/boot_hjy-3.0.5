package com.example.demo.domain;

import java.time.*;

import lombok.*;

@Data
public class Employee {
	private Integer id;
	private String lastName;
	private String firstName;
	private LocalDate birthDate;
	private String photo;
	private String notes;
}
