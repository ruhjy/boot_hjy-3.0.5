package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper07 {

	@Select("select CustomerID as id, CustomerName as name, ContactName, Address "
			+ "from Customers "
			+ "where CustomerName like #{pattern} "
			+ "order by id desc ")
	List<Customer> sql1(String keyword);

	@Select("select EmployeeID as id, LastName, FirstName "
			+ "from Employees"
			+ "where lastName like #{keyword} or firstName like #{keyword} "
			+ "order by id desc ")
	List<Employee> sql2(String keyword);

	@Select("<script> "
			+ "select count(*) from Customers "
			+ "		<if test='true'> "
			+ "			where CustomerID = 10 "
			+ "		</if> "
			+ "</script>")
	Integer sql3();

	@Select("""
			<script>
				select count(*) from Customers
					<if test="keyword neq null">
						<bind name="pattern" value="'%' + keyword + '%'" />
						where CustomerName like #{pattern}
					</if>
			</script>
			""")
	Integer sql44(String keyword);
	
	@Select("""
			<script>
				select avg(price) from Products
				<if test="id neq 0">
					where CategoryID = #{id}
				</if>
			</script>
			""")
	Double sql5(Integer id);

	@Select("<script> "
			+ "select count(*) from Customers "
			+ "		<if test=\"keyword != null\"> "
			+ "			<bind name=\"pattern\" value=\"\'%\' + keyword + \'%\'\" /> "
			+ "			where CustomerName like #{pattern} "
			+ "		</if>"
			+ "</script>")
	Integer sql4(String keyword);
}
