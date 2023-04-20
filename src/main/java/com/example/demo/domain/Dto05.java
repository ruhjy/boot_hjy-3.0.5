package com.example.demo.domain;

import java.time.*;

public class Dto05 {
	private String name;
	private Integer age;
	private Double price;
	private LocalDate birth;
	private LocalDateTime inserted;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}

	public LocalDateTime getInserted() {
		return inserted;
	}

	public void setInserted(LocalDateTime inserted) {
		this.inserted = inserted;
	}

	@Override
	public String toString() {
		return "Dto05 [name=" + name + ", age=" + age + ", price=" + price + ", birth=" + birth + ", inserted="
				+ inserted + "]";
	}
	
}
