package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper05 {

	@Update("update MyTable39 set Col2 = '수정된 값', Col3 = 99999")
	int sql1();
	
	@Update("update MyTable39 set Col2 = #{val1}, Col3 = #{val2} where Col1 = #{key}")
	int sql2(Integer key, String val1, Integer val2);
	
	@Update("update Customers set CustomerName = #{name}, Country=#{country} where CustomerID = #{id}")
	int sql3(Integer id, String name, String country);
	
	@Update("update Customers set "
			+ "CustomerName = #{name}, "
			+ "ContactName = #{contactName}, "
			+ "Address = #{address}, "
			+ "City = #{city}, "
			+ "PostalCode = #{postalCode}, "
			+ "Country = #{country} "
			+ "where CustomerID = #{id}")
	int sql4(Customer customer);
	
	@Select("select CustomerID as id, CustomerName as name, ContactName, Address, City, PostalCode, Country "
			+ "from Customers "
			+ "where CustomerID = #{id}")
	Customer sql5(Integer id);
	
	@Select("select EmployeeID as id, LastName, FirstName, BirthDate, Photo, Notes "
			+ "from Employees where EmployeeID = #{id}")
	Employee sql6(Integer id);
	
	@Update("update Employees "
			+ "set LastName = #{lastName}, "
			+ "    FirstName = #{firstName}, "
			+ "    Photo = #{photo}, "
			+ "    Notes = #{notes}, "
			+ "    BirthDate = #{birthDate} "
			+ "where EmployeeID = #{id}")
	int sql7(Employee e);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @Select("select EmployeeID as id, LastName, FirstName, BirthDate, Photo, Notes "
	 * + "from Employees")
	 * List<Employee> sql6();
	 * 
	 * @Select("select EmployeeID as id, LastName, FirstName, BirthDate, Photo, Notes "
	 * + "from Employees where EmployeeID = #{id}")
	 * Employee sql7(Integer id);
	 * 
	 * @Update("update Employees set "
	 * + "LastName = #{lastName}, "
	 * + "FirstName = #{firstName}, "
	 * + "BirthDate = #{birthDate}, "
	 * + "Photo = #{photo}, "
	 * + "Notes = #{notes} "
	 * + "where EmployeeID = #{id}")
	 * int sql8(Employee employee);
	 * 
	 * @Insert("insert into Employees(LastName, FirstName, BirthDate, Photo, Notes) "
	 * + "values (#{lastName}, #{firstName}, #{birthDate}, #{photo}, #{notes})")
	 * 
	 * @Options(useGeneratedKeys = true, keyProperty = "id")
	 * int sql9(Employee employee);
	 */
	
	
	
	
	
	
	
	
}
