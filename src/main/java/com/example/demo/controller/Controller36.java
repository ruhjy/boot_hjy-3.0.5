package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.*;

@Controller
@RequestMapping("/sub36")
public class Controller36 {
	// ajax - 비동기식

	@GetMapping("/view")
	public String view() {
		return "sub36/view";
	}

	@Data
	static class Dto1 {
		private String name;
		private Integer age;
	}

	// {"name":"정대만", "age":40}
	@PostMapping("/link1")
	public void method1(@RequestBody Dto1 dto) {
		System.out.println("dto : " + dto);
	}

	@Data
	static class Dto2 {
		private String name;
		private String email;
		private Double score;
		private Boolean married;
	}

	// {"name":"강백호", "email":"abc@naer.com", "score": 8.8, "married":false}
	@PostMapping("/link2")
	public void method2(@RequestBody Dto2 dto) {
		System.out.println("dto : " + dto);
	}

	@Data
	static class Dto3 {
		private String name;
		private List<String> hobby;
//		private String[] hobby;
	}

	@PostMapping("/link3")
	public void method3(@RequestBody Dto3 dto) {
		System.out.println("dto : " + dto);
	}

	@Data
	static class Dto4 {
		private List<String> phone;
	}

	// {"phone":["abc", "samsung", "apple"]}
	@PostMapping("/link4")
	public void method4(@RequestBody Dto4 dto) {
		System.out.println("dto : " + dto);
		System.out.println("dto.getPhone().get(2) : " + dto.getPhone().get(2));
	}

	@Data
	static class Dto5 {
		private String title;
		private String publisher;
		private Dto1 writer;
	}

	@PostMapping("/link5")
	public void method5(@RequestBody Dto5 dto) {
		System.out.println("dto : " + dto);
	}

	@Data
	static class Dto6 {
		private String city;
		private Integer price;
		private Dto2 etc;
	}

	@PostMapping("/link6")
	public void method6(@RequestBody Dto6 dto) {
		System.out.println("dto : " + dto);
	}

	@PostMapping("/link7")
	public void method7(@RequestBody List<Dto1> dtos) {
		dtos.forEach(System.out::println);
	}

}
