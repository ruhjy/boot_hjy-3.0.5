package com.example.demo.component;

import org.springframework.security.core.*;
import org.springframework.stereotype.*;

@Component
public class SecurityUtil {

	public boolean checkBoardWriter(Authentication authentication, String id) {

		System.out.println("게시물 작성자 확인 메서드");
		System.out.println("authentication Name= " + authentication.getName());
		System.out.println("id= " + id);

		return true;
	}

}
