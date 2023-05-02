package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("/sub31")
public class Controller31 {

	@Autowired
	private Mapper11 mapper;

	// 경로 : localhost:8082/sub31/link1?id=1
	@GetMapping("/link1")
	public void method1(@RequestParam Integer id) {
		// 1번 카테고리 정보
		Category category = mapper.sql1(1);

		System.out.println(category);
		category.getProducts().forEach(System.out::println);
	}

	// 경로 : localhost:8082/sub31/link2?id=1
	@GetMapping("/link2")
	public void method2(@RequestParam Integer id) {

		Category category = mapper.sql2(id);

		System.out.println(category);
		category.getProducts().forEach(System.out::println);
	}

	// 경로 : localhost:8082/sub31/link3?id=1
	@GetMapping("/link3")
	public void method3(@RequestParam Integer id) {

		Supplier supplier = mapper.sql3(id);

		System.out.println(supplier);
		supplier.getProducts().forEach(System.out::println);
	}

}
