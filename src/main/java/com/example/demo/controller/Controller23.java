package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.mapper.*;

import lombok.extern.slf4j.*;

@Slf4j
@Controller
@RequestMapping("/sub23")
public class Controller23 {

	@Autowired
	private Mapper04 mapper;

	@RequestMapping("/link1")
	public void method1() {
		int result = mapper.sql1();
		log.info("{} row(s) affected", result);
	}
	
	// 경로 : /sub23/link2?id=5
	@RequestMapping("/link2")
	public void method2(@RequestParam Integer id) {
		int result = mapper.sql2(id);
		log.info("{} row(s) affected", result);
	}
	
	// 경로 : /sub23/link3?key=7
	// 메서드 만들기, 7번 고객 삭제 하기
	@RequestMapping("/link3")
	public void method3(@RequestParam("key") Integer id) {
		int result = mapper.sql3(id);
		log.info("{} row(s) affected", result);
	}

}
