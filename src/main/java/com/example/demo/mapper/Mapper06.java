package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper06 {

	@Select("select CustomerID as id, CustomerName as name, ContactName, Address, City, Country "
			+ "from Customers order by CustomerID desc limit #{startIndex}, 20" )
	List<Customer> listCustomer(Integer startIndex);
	
	@Select("select count(*) from Customers")
	Integer countAll();
	
}
