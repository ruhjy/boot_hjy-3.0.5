package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;

import com.example.demo.component.*;
import com.example.demo.domain.*;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// Spring Beans : 스프링이 관리하는 객체들
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		/*
		 * Object o1 = ac.getBean("bean1");
		 * System.out.println("o1 : " + o1);
		 * 
		 * Object o2 = ac.getBean("employee");
		 * Object o3 = ac.getBean("employee");
		 * System.out.println("o2 : " + o2);
		 * System.out.println("o3 : " + o3);
		 * 
		 * System.out.println(System.identityHashCode(o2));
		 * System.out.println(System.identityHashCode(o3));
		 * 
		 * ComponentA compA = ac.getBean(ComponentA.class, "bean2");
		 * ComponentB compB = ac.getBean(ComponentB.class, "bean3");
		 * ComponentC compC = ac.getBean(ComponentC.class, "bean4");
		 * System.out.println("compA : " + compA);
		 * System.out.println("compB : " + compB);
		 * System.out.println("compC : " + compC);
		 * 
		 * System.out.println("compA.getComp() : " + compA.getComp());
		 * System.out.println("compC.getCom() : " + compC.getCom());
		 * 
		 * ComponentD compD1 = ac.getBean(ComponentD.class);
		 * Object compD2 = ac.getBean("componentD");
		 * ComponentD compD3 = ac.getBean(ComponentD.class, "componentD");
		 * System.out.println("compD1 : " + compD1);
		 * System.out.println("compD2 : " + compD2);
		 * System.out.println("compD3 : " + compD3);
		 * 
		 * ComponentD compD = ac.getBean(ComponentD.class, "componentD");
		 * ComponentE compE = ac.getBean(ComponentE.class, "componentE");
		 * System.out.println("compD : " + compD);
		 * System.out.println("compE.getComp() : " + compE.getComp());
		 * 
		 * System.out.println(compD == compE.getComp()); // true
		 * System.out.println(compD.equals(compE.getComp())); // true
		 * System.out.println(System.identityHashCode(compD)); // 1183952105
		 * System.out.println(System.identityHashCode(compE.getComp())); // 1183952105
		 */
	}

	// 우리가 객체를 직접 만들 때
	public void legacy() {
		Object o = new Object(); // 직접 만든 객체
		Employee e = new Employee(); // 직접 만든 객체

		e.setId(100); // 프로퍼티 직접 할당
	}

}
