package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface Mapper10 {

	@Update("update Bank set money = money - 500 where name = 'A'")
	void minusA();

	@Update("update Bank set money = money + 500 where name = 'B'")
	void plusB();

}
