package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("/sub28")
public class Controller28 {

	@Autowired
	private Mapper09 mapper;

	@GetMapping("/link1")
	public void method1() {
		mapper.sql1(List.of("UK", "USA"));
	}
	
	@GetMapping("/link2")
	public void method2() {
		List<Supplier> list1 = mapper.sql2(List.of("UK", "USA", "Japan"));
		list1.forEach(System.out::println);
		
		List<Supplier> list2 = mapper.sql2(List.of("Brazil", "Germany"));
		list2.forEach(System.out::println);
	}
	
	@GetMapping("/link3")
	public void method3() {
		
	}
	
//	@GetMapping("/link4")
	public void method3_1(@RequestParam(defaultValue = "%%") List<String> country) {
		System.out.println(country);
		mapper.sql2(country).forEach(System.out::println);
	}
	
	@GetMapping("/link4")
	public void method3_2(@RequestParam(required = false) List<String> country) {
		System.out.println(country);
		mapper.sql3(country).forEach(System.out::println);
	}

}
