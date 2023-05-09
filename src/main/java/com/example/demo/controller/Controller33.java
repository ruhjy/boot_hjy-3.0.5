package com.example.demo.controller;

import org.springframework.security.core.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sub33")
public class Controller33 {

	@GetMapping("/mylogin")
	public String loginForm() {
		return "sub33/mylogin";
	}

	@GetMapping("/loginSuccess")
	public String loginSuccess() {
		return "sub33/loginSuccess";
	}

	@GetMapping("/viewAuth")
	public String viewAuth(Authentication authentication) {
		System.out.println("로그인 정보 확인 하기");

		System.out.println("authentication= " + authentication);
		System.out.println("getName()=" + authentication.getName());
		return null;
	}

	@GetMapping("/customCheck")
	public void customCheck() {
		System.out.println("customCheck 메서드 실행중...");
	}
}
