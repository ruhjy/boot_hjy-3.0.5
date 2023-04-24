package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper03 {

	@Insert("insert into MyTable34 (Col1, Col2) values (#{val1}, #{val2})")
	int sql1(Integer val1, String val2);

	// MyTable35 만들기
	// controller22.method2에서 mapper03.sql2 메서드 호출
	@Insert("insert into MyTable35 (Col1, Col2) values (#{v1}, #{v2})")
	int sql2(Double v1, String v2);

	/**
	 * 파라미터 1개일 때
	 * 프로퍼티명만 작성
	 * @Insert("insert into MyTable36 (Col1, Col2, Col3) values (#{property1},
	 * #{property2}, #{property3})")
	 * int sql3(Dto09 dto);
	 */
	@Insert("insert into MyTable36 (Col1, Col2, Col3) values (#{dto.property1}, #{dto.property2}, #{dto.property3})")
	int sql3(@Param("dto") Dto09 dto);

	// 1) MyTable37 테이블 만들기
	// 2) Dto10 자바빈 만들기
	// 3) mapper03.sql4 메서드를 controller22.method5에서 호출
	@Insert("insert into MyTable37 (Age, Name, Score) values (#{age}, #{name}, #{score})")
	int sql4(Dto10 dto);

	@Insert("insert into MyTable37 (Age, Name, Score) "
			+ "values(#{dto9.property1}, #{dto10.name}, #{dto9.property3})")
	int sql5(Dto09 dto9, Dto10 dto10);

	/*
	 * dto1.property1 -> col1
	 * dto2.age -> col2
	 * dto1.property2 -> col3
	 * dto2.name -> col4
	 * dto1.property3 -> col5
	 * dto2.score -> col6
	 * ? 부분 코드 수정
	 * 이 메소드를 controller22.method9에서 호출
	 */
	@Insert("insert into MyTable38 (Col1, Col2, Col3, Col4, Col5, Col6) "
			+ "values (#{dto1.property1}, #{dto2.age}, #{dto1.property2}, #{dto2.name}, #{dto1.property3}, #{dto2.score})")
	int sql6(Dto09 dto1, Dto10 dto2);
	
	
	@Insert("insert into MyTable39 (Col2, Col3) values (#{prop2}, #{prop3})")
	@Options(useGeneratedKeys = true, keyProperty = "prop1")
	int sql7(Dto11 dto);
	
	@Insert("insert into MyTable40 (age, name, score) values (#{age}, #{name}, #{score})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	int sql8(Dto12 dto);

}
