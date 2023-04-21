package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

import lombok.extern.slf4j.*;

@Slf4j
@Controller
@RequestMapping("/sub22")
public class Controller22 {

	@Autowired
	private Mapper03 mapper;

	@RequestMapping("/link1")
	public void method1() {
		int result1 = mapper.sql1(66, "java");
		int result2 = mapper.sql1(77, "spring");
		int result3 = mapper.sql1(88, "css");
		log.info("{} row(s) affected", result1);
		log.info("{} row(s) affected", result2);
		log.info("{} row(s) affected", result3);
	}
	
	@RequestMapping("/link2")
	public void method2() {
		int result1 = mapper.sql2(30.4, "30점사");
		int result2 = mapper.sql2(3.4, "3점사");
		int result3 = mapper.sql2(1.4, "1점사");
		log.info("{} row(s) affected", result1);
		log.info("{} row(s) affected", result2);
		log.info("{} row(s) affected", result3);
	}
	
	// 경로 : /sub22/link3?val1=5.4&val2=5점사
	@RequestMapping("/link3")
	public void method3(@RequestParam Double val1, @RequestParam String val2) {
		mapper.sql2(val1, val2);
	}
	
	@RequestMapping("/link4")
	public void method4() {
		Dto09 dto = new Dto09();
		dto.setProperty1(300);
		dto.setProperty2("hello mybatis");
		dto.setProperty3(33.33);
		
		int result = mapper.sql3(dto);
		log.info("{} row(s) affected", result);
	}
	
	@RequestMapping("/link5")
	public void method5() {
		Dto10 dto = new Dto10(33, "hjy", 20.99);
		int result = mapper.sql4(dto);
		log.info("{} row(s) affected", result);
	}
	
	// /sub22/link6?age=43&name=heo&score=77.77
	@RequestMapping("/link6")
	public void method6(@ModelAttribute Dto10 dto) {
		int result = mapper.sql4(dto);
		log.info("{} row(s) affected", result);
	}
	
	// MyTable36에 데이터 추가될 수 있게
	// 아래 코드 수정하기
	// 경로 : /sub22/link7?property1=111&property2=exception&property3=12345.67
	@RequestMapping("/link7")
	public void method7(@ModelAttribute Dto09 dto) {
		int cnt = mapper.sql3(dto);
		log.info("{} row(s) affected", cnt);
	}
	
	@RequestMapping("/link8")
	public void method8() {
		Dto09 dto1 = new Dto09();
		Dto10 dto2 = new Dto10();
		dto1.setProperty1(345);
		dto2.setName("서태웅");
		dto1.setProperty3(12.34);
		int cnt = mapper.sql5(dto1, dto2);
		log.info("{} row(s) affected", cnt);
	}
}
