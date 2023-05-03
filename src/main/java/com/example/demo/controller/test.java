package com.example.demo.controller;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<script> "
				+ "select count(*) from Customers "
				+ "		<if test='keyword != null'> "
				+ "			<bind name=\"pattern\" value=\"\'%\' + keyword + \'%\'\" /> "
				+ "			where CustomerName like #{pattern} "
				+ "		</if>"
				+ "</script>");

		System.out.println("""
				<script>
					select count(*) from Customers
						<if test="keyword neq null">
							<bind name="pattern" value="'%' + keyword + '%'" />
							where CustomerName like #{pattern}
						</if>
				</script>
				""");

		System.out.println("<script> \n"
				+ "\t<![CDATA[ \n"
				+ "\t\tselect count(*) from Customers \n"
				+ "\t\twhere CustomerId < #{id} \n"
				+ "\t]]> \n"
				+ "</script> \n");
		
		System.out.println("<script> \n"
			+ "<![CDATA[ \n"
			+ "select count(*) from Customers \n"
			+ "where CustomerId < #{id} \n"
			+ "]]> \n"
			+ "<where> \n"
			+ "<if test=\"true\"> \n"
			+ "	<![CDATA[ \n"
			+ "	or CustomerId < #{id} \n"
			+ "	]]> \n"
			+ "	</if> \n"
			+ "<where> \n"
			+ "</script> \n");
		
		System.out.println("""
			<script>
			select count(*) from Customers
			where country in (
				<foreach collection="elems" item="elem" separator=", ">
				#{elem}
				</foreach>
			)
			</script>
			""");
		

	}
	static class Solution {
	    public static int solution(int number, int n, int m) {
	        int answer = 0;
	        if ((number % n) == 0 && (number % m) == 0) {
	            return 1;
	        } else {
	            return anwser;
	        }
	    }
	}

}
