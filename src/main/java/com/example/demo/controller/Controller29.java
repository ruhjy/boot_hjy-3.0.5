package com.example.demo.controller;

import java.io.*;
import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import lombok.*;

@Controller
@RequestMapping("/sub29")
public class Controller29 {

	// 경로 : /sub29/link1?name=son&age=33
	@GetMapping("/link1")
	public void method1() {

	}

	// 파일 업로드는 post, MultipartFile 클래스 사용
	@PostMapping("/link2")
	public void method2(
			@RequestParam("myname") String name,
			@RequestParam("myfile") MultipartFile file) {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
	}

	@GetMapping("/link3")
	public void method3() {
		// 파일 Input이 있는 form을 포함한 뷰(link3.jsp)로 포워드
	}

	// 여러 파일 받을 경우 배열 사용
	@PostMapping("/link4")
	public void method4(
			@RequestParam("name") String name,
			@RequestParam("age") Integer age,
			@RequestParam("files") MultipartFile[] file) {
		System.out.println(name + ", " + age);

		for (MultipartFile f : file) {
			System.out.println(f.getOriginalFilename());
			System.out.println(f.getSize());
		}
	}

	@GetMapping("/link5")
	public void method5() {

	}

	@PostMapping("/link6")
	public void method6(@RequestParam("files") MultipartFile[] files) {
		for (MultipartFile file : files) {
			System.out.println(file.getOriginalFilename());
			System.out.println(file.getSize());
		}
	}

	@GetMapping("/link7")
	public void method7() {

	}

//	@PostMapping("/link8")
	public void method8_1(
			@RequestParam("name") String name,
			@RequestParam("age") Integer age,
			@RequestParam("files") MultipartFile[] files) {

		System.out.println("name : " + name);
		System.out.println("age : " + age);
		for (MultipartFile file : files) {
			System.out.println("OriginalFilename : " + file.getOriginalFilename());
			System.out.println("Size : " + file.getSize());
		}
	}

	@PostMapping("/link8")
	public void method8_2(
			@ModelAttribute("dto") Sub29Dto dto,
			@RequestParam("name") String name,
			@RequestParam("age") Integer age,
			@RequestParam("files") MultipartFile[] files) {

		System.out.println("dto : " + dto);
		System.out.println("dto.getName() : " + dto.getName());
		System.out.println("dto.getAge() : " + dto.getAge());
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		for (MultipartFile file : files) {
			System.out.println("OriginalFilename : " + file.getOriginalFilename());
			System.out.println("Size : " + file.getSize());
		}
	}

	@Data
	static class Sub29Dto {
		private String name;
		private Integer age;
	}

	// 업로드한 파일 저장
	@GetMapping("/link9")
	public void method9() {

	}

	@PostMapping("/link10")
	public void method10(@RequestParam("file1") MultipartFile file) {
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());

		try (
				InputStream fis = file.getInputStream();
				BufferedInputStream bis = new BufferedInputStream(fis);) {

			String targetFileName = "copy_" + file.getOriginalFilename();

			try (
					FileOutputStream fos = new FileOutputStream(targetFileName);
					BufferedOutputStream bos = new BufferedOutputStream(fos);) {

				byte[] datas = new byte[1024];
				int len = 0;
				while ((len = bis.read(datas)) != -1) {
					bos.write(datas, 0, len);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PostMapping("/link11")
	public void method11(@RequestParam("file1") MultipartFile file) throws IllegalStateException, IOException {
		
		File target = new File("C:/study/copy11_" + file.getOriginalFilename());
		file.transferTo(target);
	}

}
