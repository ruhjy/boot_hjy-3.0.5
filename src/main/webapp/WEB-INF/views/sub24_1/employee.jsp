<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>

	<h1>${employee.id }번 직원 상세</h1>
	<div>
		<form action="/sub24/link9?id=${employee.id }" method="post">
			ID <input type="text" name="id" value="${employee.id }" readonly /> <br />
			성 <input type="text" name="lastName" value="${employee.lastName }" readonly /> <br />
			이름 <input type="text" name="firstName" value="${employee.firstName }" readonly /> <br />
			생일 <input type="text" name="birthDate" value="${employee.birthDate }" readonly /> <br />
			사진 <input type="text" name="photo" value="${employee.photo }" readonly /> <br />
			특징 <input type="text" name="notes" value="${employee.notes }" readonly /> <br />
			<button type="submit">수정</button>
		</form>
	</div>
	
	<button type="button" onclick="location.href='/sub24/link7'">목록</button>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>