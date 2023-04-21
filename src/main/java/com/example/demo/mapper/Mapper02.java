package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper02 {

	@Select("select CustomerName from Customers")
	List<String> sql1();

	// 모든 직원의 LastName 출력
	@Select("select LastName from Employees")
	List<String> sql2();

	@Select("select LastName, FirstName from Employees")
	List<Dto07> sql3();

	@Select("select ProductName as name, Price from Products")
	List<Dto08> sql4();

	@Select("select ProductName from Products where CategoryID = #{categoryId}")
	List<String> sql5(Integer categoryId);

	@Select("select CustomerName from Customers where Country = #{country}")
	List<String> sql6(String country);

	@Select("select ProductName as name, Price from Products where CategoryID = #{cid}")
	// 메서드 작성
	// 작성된 메서드를 controller21.method7에서 호출
	List<Dto08> sql7(Integer cid);

}
