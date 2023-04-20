package com.example.demo.mapper;

import java.time.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper01 {

	@Select("select CustomerName from Customers where CustomerID = 7")
	String method1();
	
	@Select("select FirstName from Employees where EmployeeID = 1")
	String method2();
	
	@Select("select SupplierName from Suppliers where SupplierID = 1")
	String method3();
	
	@Select("select CustomerName from Customers where CustomerID = #{id}")
	String method4(Integer id);

	@Select("select LastName from Employees where EmployeeID = #{id}")
	String method5(Integer id);
	
	@Select("select price from MyTable33 limit 1")
	Integer method6();
	
	@Select("select weight from MyTable33 limit 1")
	Double method7();
	
	@Select("select published from MyTable33 limit 1")
	LocalDate method8();
	
	@Select("select updated from MyTable33 limit 1")
	LocalDateTime method9();
	
	@Select("select title, published, price, updated, weight "
			+ "from MyTable33 limit 1")
	// 테이블의 컬럼명과 (대소문자 구분없이) 매치되는 빈을 생성 후 반환타입으로 하면됨.
	Book method10();
	
//	@Select("select name, age, price, birth, inserted from MyTable32 limit 1")
	@Select("select * from MyTable32 limit 1")
	Dto05 method11();
	
	@Select("select CustomerID as id, CustomerName as name, ContactName, Address, City, PostalCode, Country "
			+ "from Customers where CustomerID = 7")
	Customer method12();
	
	@Select("select SupplierID as id, SupplierName as name, ContactName, Address, City, PostalCode, Country, Phone "
			+ "from Suppliers where SupplierID = #{id}")
	Supplier method13(Integer id);

	@Select("select employeeid id, lastname, firstname, birthdate, photo, notes "
			+ "from Employees where employeeid = #{id}")
	Employee method14(Integer id);
//	update Employees set lastName = '백호', firstName = '강', notes = '슬램덩크' where EmployeeId = 9;
	@Update("update Employees set lastName = #{lastName}, firstName = #{firstName}, notes=#{notes} "
			+ "where EmployeeID = #{id}")
	Employee updatEmployee(String lastName, String firstName, String notes, Integer id);
	
	@Insert("insert into Employees (lastName, firstName, notes) values (#{lastName}, #{firstName}, #{notes})")
	void insertEmployee(String lastName, String firstName, String notes);
}
