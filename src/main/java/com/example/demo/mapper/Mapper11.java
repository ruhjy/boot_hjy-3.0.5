package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper11 {

	@Select("""
			select 
				c.CategoryID,
				c.CategoryName,
				Description,
				p.ProductName
			from Categories c
				join Products p on c.CategoryID = p.CategoryID
			where c.CategoryID = #{id};
			""")
	@ResultMap("categoryResult")
	Category sql1(Integer id);
	
	
	@Select("""
			select
				c.CategoryId,
				c.CategoryName,
				c.Description,
				p.ProductName,
				p.price
			from Categories c
				join Products p on c.CategoryID = p.CategoryID
			where c.CategoryID = #{id};
			""")
	@ResultMap("categoryResultMap")
	Category sql2(Integer id);
	
	@Select("""
			select
				s.SupplierID,
				s.SupplierName,
				s.ContactName,
				s.Address,
				s.City,
				s.PostalCode,
				s.Country,
				s.Phone,
				p.ProductName,
				p.Unit,
				p.price
			from Suppliers s
				join Products p on s.SupplierID = p.SupplierID
			where s.SupplierID = #{id}
			""")
	@ResultMap("supplierResultMap")
	Supplier sql3(Integer id);

}
