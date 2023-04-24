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
	
	@RequestMapping("/link9")
	public void method9() {
		Dto09 dto1 = new Dto09(1000, "spring", 50.0);
		Dto10 dto2 = new Dto10(2000, "spring boot", 20.0);
		int cnt = mapper.sql6(dto1, dto2);
		log.info("{} row(s) affected", cnt);
	}
	
	// 경로 : /sub22/link10?property1=100&property2=memberA&property3=12.34&age=200&name=memberB&score=56.78
	@RequestMapping("/link10")
	public void method10(@ModelAttribute Dto09 p1, @ModelAttribute Dto10 p2) {
		int cnt = mapper.sql6(p1, p2);
		log.info("{} row(s) affected", cnt);
	}

	// 경로 : /sub22/link11?prop2=mybatis&prop3=321
	@RequestMapping("/link11")
	@ResponseBody
	public String method11(@ModelAttribute Dto11 dto) {
		log.info("prop1: {}", dto.getProp1());
		int cnt = mapper.sql7(dto);
		log.info("{}번 : {} row(s) affected", dto.getProp1(), cnt);
		
		return dto.getProp1() + "번째 데이터 입력 완료!!!";
	}
	
	// 경로 : /sub22/link12?age=40&name=son&score=9.9
	// 요청시 MyTable40에 데이터 추가되도록 코드
	// 컨트롤러메서드, 매퍼 메서드, 자바빈
	// *자바빈의 id 프로퍼티에 자동증가 컬럼값 받을 수 있게...
	@RequestMapping("/link12")
	@ResponseBody
	public String method12(@ModelAttribute Dto12 param) {
		int cnt = mapper.sql8(param);
		log.info("id = {}, {} row(s) affected", param.getId(), cnt);
		return param.getId() + " 번째 데이터 입력 완료!";
	}
	
}
