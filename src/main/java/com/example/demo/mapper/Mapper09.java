package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper09 {
	
//	@Select("""
//			<script>
//			select count(*) from Customers
//			where country in (
//				<foreach collection="elems" item="elem" separator=", ">
//					#{elem}
//				</foreach>
//			)
//			</script>
//			""")
	Integer sql1(List<String> elems);
	
//	@Select("""
//			<script>
//				select SupplierID as id,
//					   SupplierName as name,
//					   ContactName,
//					   Address,
//					   City,
//					   PostalCode,
//					   Country,
//					   Phone
//				from Suppliers
//				where Country in (
//					<foreach collection="elems" item="param" separator=", ">
//						#{param}
//					</foreach>
//				)
//			</script>
//			""")
	List<Supplier> sql2(List<String> elems);
	
//	@Select("""
//			<script>
//				select SupplierID as id,
//					   SupplierName as name,
//					   ContactName,
//					   Address,
//					   City,
//					   PostalCode,
//					   Country,
//					   Phone
//				from Suppliers
//				<where>
//					<if test="elems != null">
//						Country in (
//							<foreach collection="elems" item="param" separator=", ">
//								#{param}
//							</foreach>
//						)
//					</if>
//				</where>
//			</script>
//			""")
	List<Supplier> sql3(List<String> elems);


}
