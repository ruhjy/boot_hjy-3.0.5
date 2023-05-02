package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.mapper.*;

@Controller
@RequestMapping("/sub30")
public class Controller30 {
	
	@Autowired
	private Mapper10 mapper;

	@GetMapping("/link1")
	public void method1() {
		// A 고객의 돈 500원 차감
		mapper.minusA();
		
		// B 고객의 돈 500원 증가
		mapper.plusB();
	}
	
	@GetMapping("/link2")
	public void method2() {
		// A 고객의 돈 500원 차감
		mapper.minusA();
		
		int a = 3 / 0; // 런타임 예외
		
		// B 고객의 돈 500원 증가
		mapper.plusB();
	}
	
	@GetMapping("/link3")
	@Transactional // 런타임 예외 시 롤백
	public void method3() {
		// A 고객의 돈 500원 차감
		mapper.minusA();
		
		int a = 3 / 0; // 런타임 예외
		
		// B 고객의 돈 500원 증가
		mapper.plusB();
	}
	
	@GetMapping("/link4")
	@Transactional
	public void method4() throws ClassNotFoundException {
		// A 고객의 돈 500원 차감
		mapper.minusA();
		
		Class.forName("java.lang.String2"); // checked exception - 롤백 안됨.
		
		// B 고객의 돈 500원 증가
		mapper.plusB();
	}
	
	@GetMapping("/link5")
	@Transactional(rollbackFor = ClassNotFoundException.class) // rollbackFor에 예외 종류 입력해주면 롤백 가능
	public void method5() throws ClassNotFoundException {
		// A 고객의 돈 500원 차감
		mapper.minusA();
		
		Class.forName("java.lang.String2"); // checked exception - 롤백 안됨.
		
		// B 고객의 돈 500원 증가
		mapper.plusB();
	}

}
