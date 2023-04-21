package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

import lombok.extern.slf4j.*;

@Slf4j
@Controller
@RequestMapping("/sub21")
public class Controller21 {

	@Autowired
	private Mapper02 mapper;

	@RequestMapping("/link1")
	public void method1() {
		List<String> list = mapper.sql1();
		list.forEach(System.out::println);
	}
	
	// 경로 : /sub21/link2
	// 모든 직원의 lastName 출력
	@RequestMapping("/link2")
	public void method2() {
		List<String> list = mapper.sql2();
		for (String string : list) {
			System.out.println("LastName : " + string);
		}
	}
	
	@RequestMapping("/link3")
	public void method3() {
		List<Dto07> names = mapper.sql3();
		names.forEach(System.out::println);
	}
	
	// 모든 상품의 이름, 가격을 조회해서 콘솔에 출력
	// 1) 컨트롤러 메서드
	// 2) 매퍼 메서드
	// 3) Dto08 자바빈
	@RequestMapping("/link4")
	public void method4() {
		List<Dto08> products = mapper.sql4();
		products.forEach(System.out::println);
	}
	
	@RequestMapping("/link5")
	public void method5(@RequestParam("cid") Integer categoryId) {
		List<String> names = mapper.sql5(categoryId);
		names.forEach(System.out::println);
	}

	// 링크 : /sub21/link6?country=uk
	// 링크 : /sub21/link6?country=canada
	// 각 국가에 있는 고객명(CustomerName)이 콘솔에 출력
	// 1) 컨트롤러메서드
	// 2) 메퍼 메서드
	@RequestMapping("/link6")
	public void method6(@RequestParam("country") String country) {
		List<String> names = mapper.sql6(country);
		names.forEach(System.out::println);
	}
	
	@RequestMapping("/link7")
	public void method7(@RequestParam("cid") Integer cid) {
		List<Dto08> products = mapper.sql7(cid);
		products.forEach(System.out::println);
	}
}
