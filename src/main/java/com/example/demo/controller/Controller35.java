package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.*;

@Controller
@RequestMapping("/sub35")
public class Controller35 {
	// ajax - 비동기식

	@GetMapping("/ajax1")
	public String view() {
		return "sub35/ajax1";
	}

	@PostMapping("/link1")
	public void method1() {
		System.out.println("포스트 요청 잘 받음");
	}

	@PostMapping("/link2")
	public void method2() {
		System.out.println("메서드2 일함!!");
	}

	@PostMapping("/link3")
	public void method3(@RequestParam String name) {
		System.out.println("name : " + name);
	}

	@PostMapping("/link4")
	public void method4(@RequestParam String address, @RequestParam Double price) {
		System.out.println("address : " + address);
		System.out.println("price : " + price);
	}

	@Data
	static class Dto1 {
		private String name;
		private Double score;
		private String email;
	}

	@PostMapping("/link5")
	public void method5(@ModelAttribute Dto1 dto) {
		System.out.println("dto : " + dto);
	}

	@Data
	static class Dto2 {
		private String address;
		private String product;
		private Double price;
	}

	@PostMapping("/link6")
	public void method6(@ModelAttribute Dto2 dto) {
		System.out.println("dto : " + dto);
	}

	// json 요청 데이터는
	// @RequestBody Map이나 @RequestBody JavaBean으로 받음
	@PostMapping("/link7")
	public void method7(@RequestBody Map<String, Object> map) {
		System.out.println("map : " + map);
		System.out.println("name : " + map.get("name"));
	}

	@PostMapping("/link8")
	public void method8(@RequestBody Map<String, Object> data) {
		System.out.println("==================");
		System.out.println("data : " + data);
		System.out.println("==================");
		System.out.println("address : " + data.get("address"));
		System.out.println("name : " + data.get("name"));
	}

	// {"name":"hjy", "age":33, "married":false}
	@PostMapping("/link9")
	public void method9(@RequestBody Map<String, Object> data) {
		System.out.println("==================");
		System.out.println("data : " + data);
		System.out.println("==================");
		System.out.println("name : " + data.get("name"));
		System.out.println("age : " + data.get("age"));
		System.out.println("married : " + data.get("married"));
	}

	@PostMapping("/link10")
	public void method10(@RequestBody Map<String, Object> map) {
		System.out.println("==================");
		System.out.println("map : " + map);
		System.out.println("==================");
	}

	@PostMapping("/link11")
	public void method11(@RequestBody Map<String, Object> map) {
		System.out.println("==================");
		System.out.println("map : " + map);
		System.out.println("==================");
		System.out.println("book : " + map.get("book"));
		System.out.println("book type : " + map.get("book").getClass().getSimpleName());

		Map<String, Object> book = (Map<String, Object>) map.get("book");
		System.out.println("title : " + book.get("title"));
		System.out.println("price : " + book.get("price"));
	}

	@PostMapping("/link12")
	public void method12(@RequestBody Map<String, Object> map) {
		System.out.println("==================");
		System.out.println("map : " + map);
		System.out.println("==================");
		System.out.println("food type : " + map.get("food").getClass().getSimpleName());

		ArrayList<Object> foods = (ArrayList<Object>) map.get("food");
		System.out.println(foods.get(0));
		System.out.println(foods.get(1));
		System.out.println(foods.get(2));
	}

	// ["pizza", "coke", "coffee"]
	@PostMapping("/link13")
	public void method13(@RequestBody List<Object> data) {
		System.out.println("data : " + data);
	}

	// [{"name":"강백호", "pos":"파포"}, {"name":"서태웅", "pos":"스포"}] - 객체가 아이템인 배열 보내기
	@PostMapping("/link14")
	public void method14(@RequestBody List<Map<String, Object>> data) {
		System.out.println("data : " + data);
	}

}
