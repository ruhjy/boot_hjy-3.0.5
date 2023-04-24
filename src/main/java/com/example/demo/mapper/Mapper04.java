package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface Mapper04 {

	@Delete("delete from MyTable40")
	int sql1();
	
	@Delete("delete from MyTable39 where Col1 = #{id}")
	int sql2(Integer id);
	
	@Delete("delete from Customers where CustomerID = #{id}")
	int sql3(Integer id);
}
