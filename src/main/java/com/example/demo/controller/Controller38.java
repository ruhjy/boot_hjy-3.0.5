package com.example.demo.controller;

import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

import lombok.*;

@RestController // @Controller @ResponseBody
@RequestMapping("/sub38")
@RequiredArgsConstructor
public class Controller38 {
	// ajax - 비동기식
	// 응답

	private final Mapper02 mapper;

	@GetMapping("/link20")
	public List<String> method20() {
		return mapper.sql1();
	}

	@GetMapping("/link21")
	public List<Dto07> method21() {
		return mapper.sql3();
	}

	@GetMapping("/link22")
	public List<Dto08> method22(@RequestParam Integer cid) {
		return mapper.sql7(cid);
	}

}
