package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

import lombok.extern.slf4j.*;

@Slf4j
@Controller
@RequestMapping("/sub24")
public class Controller24 {

	@Autowired
	private Mapper05 mapper;

	@RequestMapping("/link1")
	public void method1() {
		int res = mapper.sql1();
		log.info("{} row(s) ", res);
	}
	
	@RequestMapping("/link2")
	public void method2() {
		int res = mapper.sql2(1, "spring", 13579);
		log.info("{} row(s) affected", res);
	}
	
	// 10번 고객 이름과 국가가 변경 되도록
	// mapper 에 sql3 메서드 작성
	@RequestMapping("/link3")
	public void method3() {
		int res = mapper.sql3(9, "새로운 고객명", "대한민국");
		log.info("{} row(s) affected", res);
	}
	
	@RequestMapping("/link4")
	public void method4() {
		Customer customer = new Customer();
		customer.setId(9);
		customer.setCity("서울");
		customer.setCountry("대한민국");
		customer.setAddress("신촌");
		customer.setContactName("강백호");
		customer.setName("서태웅");
		customer.setPostalCode("333333");
		
		int res = mapper.sql4(customer);
		log.info("{} row(s) affected", res);
	}
	
	@RequestMapping("/link5")
	public void method5(@ModelAttribute Customer customer) {
		int res = mapper.sql4(customer);
		log.info("{} row(s) affected", res);
	}
	
	// 경로 : /sub24/link6?id=9
	@RequestMapping("/link6")
	public void method6(@RequestParam Integer id, Model model) {
		Customer customer = mapper.sql5(id);
		model.addAttribute("customer", customer);
	}
	
	// ========================================================================

	// 직원 조회 및 수정 코드 작성
	@RequestMapping("/link7")
	public void employees(Model model) {
		List<Employee> employees = mapper.sql6();
		model.addAttribute("employees", employees);
	}
	
	@RequestMapping("/link8")
	public String editForm(@RequestParam Integer id, Model model) {
		Employee employee = mapper.sql7(id);
		model.addAttribute("employee", employee);
		return "sub24/employee";
	}
	
	@RequestMapping("/link9")
	public void edit(@RequestParam Integer id, Model model) {
		Employee employee = mapper.sql7(id);
		model.addAttribute("employee", employee);
	}
	
	@RequestMapping("/link10")
	public String editEmployee(@ModelAttribute Employee employee) {
		int result = mapper.sql8(employee);
		log.info("{} row(s) affected", result);
		return "redirect:/sub24/link7";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String saveForm() {
		return "sub24/saveForm";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute Employee employee) {
		int result = mapper.sql9(employee);
		log.info("{} row(s) affected", result);
		return "redirect:/sub24/link8?id=" + employee.getId();
	}
	
}
