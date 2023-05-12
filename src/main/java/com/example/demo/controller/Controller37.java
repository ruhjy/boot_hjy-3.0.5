package com.example.demo.controller;

import java.time.*;
import java.util.*;

import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.*;
import lombok.extern.slf4j.*;

@Slf4j
@Controller
@RequestMapping("/sub37")
public class Controller37 {
	// ajax - 비동기식
	// 응답

	@GetMapping("/view")
	public String view() {
		return "sub37/view";
	}

	// @ResponseBody
	// ResponseEntity<B>

	@GetMapping("/link1")
	public ResponseEntity method1() {
		// 응답코드를 valueOf() 메서드를 통해서 변환 가능 (숫자 3자리만 가능)
		ResponseEntity res = new ResponseEntity<>(HttpStatusCode.valueOf(299));
		return res;
	}

	@GetMapping("/link2")
	public ResponseEntity method2() {
		// 응답코드를 메서드를 이용해서 200으로 설정하고 조립
		ResponseEntity res = ResponseEntity.ok().build();
		return res;
	}

	@GetMapping("/link3")
	public ResponseEntity method3() {
		// 응답코드를 메서드를 이용해서 404으로 설정하고 조립
		ResponseEntity res = ResponseEntity.notFound().build();
		return res;
	}

	@GetMapping("/link4")
	public ResponseEntity method4() {

		HttpHeaders header = new HttpHeaders();
		header.add("my-header1", "my-value1");
		header.add("my-header2", "my-value2");

		ResponseEntity res = new ResponseEntity(header, HttpStatusCode.valueOf(201));
		return res;
	}

	@GetMapping("/link5")
	public ResponseEntity<String> method5() {

		ResponseEntity<String> res = new ResponseEntity<String>("hello response", HttpStatusCode.valueOf(200));
		return res;
	}

	@GetMapping("/link6")
	public ResponseEntity<String> method6() {
		return ResponseEntity.ok("hello response 222?");
	}

	@GetMapping("/link7")
	public ResponseEntity<LocalDate> method7() {
		return ResponseEntity.ok(LocalDate.now());
	}

//	@GetMapping("/link7")
	public ResponseEntity<String> method7ByString() {
		String date = LocalDate.now().toString();
		return ResponseEntity.ok(date);
	}

	@ResponseBody
	@GetMapping("/link8")
	public String method8() {
		String date = LocalDateTime.now().toString();
		return date;
	}

	@ResponseBody
	@GetMapping("/link9")
	public String method9() {
		String time = LocalTime.now().toString();
		log.info("time={}", time);
		return time;
	}

	@ResponseBody
	@GetMapping("/link10")
	public String method10() {
		String data = """
				{"name" : "lee", "age": 30}
				""";

		return data;
	}

	@GetMapping("/link11")
	public ResponseEntity<String> method11() {
		String data = """
				{"name" : "son", "age" : 33}
				""";

		HttpHeaders header = new HttpHeaders();
		header.set("Content-Type", "application/json");

		return new ResponseEntity<String>(data, header, 200);
	}

	// 리턴 타입이 Map, JavaBean 이면 json으로 변환
	// Content-Type: application/json 로 셋팅해준다.
	@ResponseBody
	@GetMapping("/link12")
	public Map<String, Object> method12() {

		Map<String, Object> map = new HashMap<>();
		map.put("name", "박지성");
		map.put("age", 44);

		return map;
	}

	@ResponseBody
	@GetMapping("/link13")
	public Map<String, Object> method13() {

		Map<String, Object> map = new HashMap<>();
		map.put("address", "seoul");
		map.put("price", 3.14);

		return map;
	}

	@ResponseBody
	@GetMapping("/link14")
	public Map<String, Object> method14() {

		Map<String, Object> data = new HashMap<>();
		data.put("name", "차범근");
		data.put("score", 67);
		data.put("married", true);
		data.put("position", null);
		data.put("child", List.of("차두리", "차하나"));
		data.put("food", Map.of("beverage", "coke", "meal", "chikcen"));

		return data;
	}

	static class Dto1 {
		public String getName() {
			return "강백호";
		}

		public Integer getAge() {
			return 33;
		}
	}

	@ResponseBody
	@GetMapping("/link15")
	public Dto1 method15() {

		Dto1 data = new Dto1();

		return data;
	}

	static class Dto2 {
		public String getCity() {
			return "jeju";
		}

		public Double getScore() {
			return 3.3;
		}

		public Boolean isCap() {
			return true;
		}

		public List<String> getFood() {
			return List.of("pizza", "chicken", "burger");
		}

		public Dto1 getSub1() {
			return new Dto1();
		}

		public Map<String, Object> getSub2() {
			return Map.of("model", List.of("abc", "def"), "price", 3.14);
		}
	}

	@ResponseBody
	@GetMapping("/link16")
	public Dto2 method16() {
		return new Dto2(); // {"city":"jeju", "score":3.3, "cap":true}
	}

	@ResponseBody
	@GetMapping("/link17")
	public List<String> method17() {
		return List.of("java", "css", "html", "spring", "jquery", "ajax");
	}

	@ResponseBody
	@GetMapping("/link18")
	public List<Map<String, Object>> method18() {
		return List.of(Map.of("name", "강백호"), Map.of("name", "채치수"), Map.of("name", "정대만"));
	}
	
	@ResponseBody
	@GetMapping("/link19")
	public List<Dto2> method19() {
		return List.of(new Dto2(), new Dto2());
	}

}
