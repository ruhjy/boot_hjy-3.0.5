package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface Mapper08 {

	@Select("<script> "
			+ "select count(*) from Customers "
			+ "<where> "
			+ "		<if test=\"id lt 5\"> "
			+ "		</if> "
			+ "</where> "
			+ "</script>")
	Integer sql1(Integer id);

	@Select("select count(*) from Customers "
			+ "where CustomerId < #{id}")
	Integer sql2(Integer id);

	@Select("<script> "
			+ "select count(*) from Customers "
			+ "where CustomerId &lt; #{id} "
			+ "</script>")
	Integer sql3(Integer id);

	@Select("<script> \n"
			+ "<![CDATA[ \n"
			+ "select count(*) from Customers \n"
			+ "where CustomerId < #{id} \n"
			+ "]]> \n"
			+ "<where> \n"
			+ "		<if test=\"true\"> \n"
			+ "		<![CDATA[ \n"
			+ "		or CustomerId < #{id} \n"
			+ "		]]> \n"
			+ "		</if> \n"
			+ "</where> \n"
			+ "</script> \n")
	Integer sql4(Integer id);

}
