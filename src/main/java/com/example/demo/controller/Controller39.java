package com.example.demo.controller;

import java.time.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("/sub39")
public class Controller39 {
	// ajax - 비동기식
	// 응답

	@GetMapping("/view")
	public String view() {
		return "sub39/view";
	}

	@ResponseBody
	@GetMapping("/link1")
	public String method1() {
		return "hello ajax";
	}

	@GetMapping("/link2")
	public ResponseEntity method2() {
		return ResponseEntity.badRequest().build(); // 400
	}

	@GetMapping("/link3")
	public ResponseEntity method3() {
		return ResponseEntity.ok().build(); // 200
	}

	@GetMapping("/link4")
	public ResponseEntity method4() {
		return ResponseEntity.internalServerError().build(); // 500
	}

//	 @GetMapping("/link4)
//	 public ResponseEntity method4() {
//	 	boolean ok = service.method();
//	 	if (ok) {
//	 		ResponseEntity.ok().build();
//	 	} else {
//	 		ResponseEntity.notFound().build();
//	 	} 
//	 }

	@ResponseBody
	@GetMapping("/link9")
	public String method9() {
		return "hello ajax!@!@";
	}

	@ResponseBody
	@GetMapping("/link10")
	public String method10() {
		return LocalTime.now().toString();
	}

	@ResponseBody
	@GetMapping("/link11")
	public Map<String, Object> method11() {
		return Map.of("name", "채소연", "age", 20);
	}

	@ResponseBody
	@GetMapping("/link12")
	public Map<String, Object> method12() {
		Map<String, Object> data = new HashMap<>();
		data.put("address", "korea");
		data.put("city", "seoul");
		data.put("phone", "apple");

		return data;
	}
	
	@ResponseBody
	@GetMapping("/link13")
	public List<String> method13() {
		return List.of("강백호", "채치수", "송태섭");
	}
	
	@Autowired
	Mapper02 mapper02;
	
	@ResponseBody
	@GetMapping("/link14")
	public List<Dto08> method14(@RequestParam Integer cid) {
		return mapper02.sql7(cid);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
