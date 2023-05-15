package com.example.demo.controller;

import java.util.*;

import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.*;
import lombok.extern.slf4j.*;

@Slf4j
@Controller
@RequestMapping("/sub40")
public class Controller40 {

	Service40 service = new Service40();

	@GetMapping("/view")
	public String view() {
		return "sub39/test";
	}

	@ResponseBody
	@GetMapping("/test")
	public Result get() {
		List<Member> members = service.findAll();
		log.info("members={}", members);
		Result<Object> result = new Result<>();
		result.setCount(members.size());
		result.setData(members);
		log.info("result={}", result);
		return result;
	}
	
	@Data
	static class Result<T> {
		private Integer count;
		private T data;
	}

	@ResponseBody
	@PostMapping("/test")
	public Member method1(@RequestBody Member member) {
		log.info("data={}", member);
		service.save(member);
		log.info("data={}", member);
		return member;
	}

	@Data
	static class Member {
		private Long id;
		private String name;
		private Integer age;
	}

	static class Service40 {
		private static Map<Long, Member> store = new HashMap<>();
		private long sequence = 0L;

		public void save(Member member) {
			member.setId(++sequence);
			store.put(member.getId(), member);
		}
		
		public List<Member> findAll() {
			return new ArrayList<>(store.values());
		}
	}

}
