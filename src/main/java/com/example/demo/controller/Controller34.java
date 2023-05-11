package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.*;

@Controller
@RequestMapping("/sub34")
public class Controller34 {
	// ajax - 비동기식
	
	@GetMapping("/ajax1")
	public String ajax1() {
		return "sub34/ajax1";
	}

	@ResponseBody
	@GetMapping("/link1")
	public String method1() {
		System.out.println("hello ajax");
		
		return "첫번째 응답 데이터";
	}
	
	@GetMapping("/link2")
	public void method2() {
		System.out.println("get 요청 link2");
	}
	
	@GetMapping("/link3")
	public void method3(@RequestParam String name) {
		System.out.println("link3 메서드 일함");
		System.out.println("name: " + name);
	}
	
	@GetMapping("/link4")
	public void method4(@RequestParam String address) {
		System.out.println("link4 메서드 일함");
		System.out.println("address: " + address);
	}
	
	// 경로 : /sub34/link5?name=손&age=33
	@GetMapping("/link5")
	public void method5(@RequestParam String name, @RequestParam Integer age) {
		System.out.println("link5 메서드 일함");
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
	
	@GetMapping("/link6")
	public void method6(@RequestParam String food, @RequestParam Double price) {
		System.out.println("link6 메서드 일함");
		System.out.println("food : " + food);
		System.out.println("price : " + price);
	}

	@Data
	static class Dto1 {
		private String name;
		private String address;
		private Integer age;
	}
	// 경로 : /sub34/link7?address=seoul&name=park&age=33
	@GetMapping("/link7")
	public void method7(@ModelAttribute Dto1 dto) {
		System.out.println("dto : " + dto);
	}
	
	@Data
	static class Dto2 {
		private String product;
		private String category;
		private Double price;
	}
	
	// 경로 : /sub34/link8?product=keyboard&category=computer&price=30000
	@GetMapping("/link8")
	public void method8(@ModelAttribute Dto2 dto) {
		System.out.println("dto : " + dto);
	}
	
	
}
