package com.example.demo.controller;

import java.time.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

import lombok.extern.slf4j.*;

@Slf4j
@Controller
@RequestMapping("/sub20")
public class Controller20 {
	
	@Autowired
	private Mapper01 mapper;
	
	@RequestMapping("/link1")
	public void method1() {
		String name = mapper.method1();
		System.out.println("이름 : " + name);
		
		System.out.println(mapper.method2());
	}
	
	@RequestMapping("/link2")
	public void method2() {
		
		// Mapper01에 method3 작성
		
		// 1번 공급자의 공급자명 출력
		System.out.println(mapper.method3());
	}
	
	@RequestMapping("/link3")
	public void method3() {
		String name = mapper.method4(9);
		System.out.println(name);
	}
	
	// 경로 : /sub20/link4?id=70
	@RequestMapping("/link4")
	public void method4(@RequestParam("id") Integer customerId) {
		String name = mapper.method4(customerId);
		System.out.println("CustomerName : " + name);
	}
	
	// 경로 : /sub20/link5?id=2
	// 2번 직원의 lastName을 콘솔에 출력
	@RequestMapping("/link5")
	public void method5(@RequestParam("id") Integer employeeId) {
		System.out.println("Employee LastName : " + mapper.method5(employeeId));
	}
	
	@RequestMapping("/link6")
	public void method6() {
		Integer price = mapper.method6();
		log.info("MyTable33.price = {}", price);
		
		// Mapper01 에 method7, 8, 9 작성
		// 하나의 row의 weight, published, updated 컬럼의 값 리턴
		Double weight = mapper.method7();
		log.info("MyTable33.weight = {}", weight);
		
		LocalDate published = mapper.method8();
		log.info("MyTable33.published = {}", published);
		
		LocalDateTime updated = mapper.method9();
		log.info("MyTable33.updated = {}", updated);
	}
	
	@RequestMapping("/link7")
	public void method7() {
		Book book = mapper.method10();
		log.info("MyTable33 = {}", book);
	}
	
	@RequestMapping("/link8")
	public void method8() {
		Dto05 o = mapper.method11();
		log.info("MyTable32 = {}", o);
	}
	
	@RequestMapping("/link9")
	public void method9() {
		Customer customer = mapper.method12();
		log.info("Customers = {}", customer);
	}
	
	@RequestMapping("/link10")
	public void method10() {
		Supplier sup = mapper.method13(2);
		log.info("Suppliers = {}", sup); // 2번 공급자 정보 출력
	}
	
	@RequestMapping("/link11")
	public void method11(Model model) {
		Employee employee = mapper.method14(5);
		log.info("Employees = {}", employee);
		model.addAttribute("employee", employee);
	}
	
	@ResponseBody
	@RequestMapping("/link111")
	public String update() {
		Employee updatEmployee = mapper.updatEmployee("백호", "강", "슬램덩크", 1);
		log.info("updateEmployee = {}", updatEmployee);
		return "ok";
	}
	
	@ResponseBody
	@RequestMapping("/link112")
	public String insert() {
		mapper.insertEmployee("대만", "정대만", "농구"); 
//		log.info("insertEmployee = {}", insertEmployee);
		return "ok";
	}
	
	
	
}
