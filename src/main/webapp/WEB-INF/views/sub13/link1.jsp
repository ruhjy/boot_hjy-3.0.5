<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
	<!-- 페이지네이션 -->
	<div>
		<nav aria-label="Page navigation example">
			<ul class="pagination">

				<!-- 맨앞 버튼 -->
				<li class="page-item">
					<c:url value="/sub26/link1" var="pageLink">
						<c:param name="page" value="1"></c:param>
					</c:url>
					<a class="page-link" href="${pageLink }">맨앞</a>
				</li>

				<!-- 이전 버튼 -->
				<c:if test="${prevPageNumber ge 1 }">
					<li class="page-item">
						<c:url value="/sub26/link1" var="pageLink">
							<c:param name="page" value="${prevPageNumber }"></c:param>
						</c:url>
						<a class="page-link" href="${pageLink }">이전</a>
					</li>
				</c:if>
				<!-- 페이지 -->
				<c:forEach begin="${leftPageNumber }" end="${rightPageNumber}" var="pageNumber">
					<c:url value="/sub26/link1" var="pageLink">
						<c:param name="page" value="${pageNumber }"></c:param>
					</c:url>
					<li class="page-item">
						<a class="page-link ${pageNumber eq currentPageNumber ? 'active' : '' }" href="${pageLink }">${pageNumber }</a>
					</li>
				</c:forEach>

				<!-- 다음 버튼 -->
				<c:if test="${nextPageNumber le lastPageNumber }">
					<li class="page-item">
						<c:url value="/sub26/link1" var="pageLink">
							<c:param name="page" value="${nextPageNumber }"></c:param>
						</c:url>
						<a class="page-link" href="${pageLink }">다음</a>
					</li>
				</c:if>

				<!-- 맨뒤 버튼 -->
				<li class="page-item">
					<c:url value="/sub26/link1" var="pageLink">
						<c:param name="page" value="${lastPageNumber }"></c:param>
					</c:url>
					<a class="page-link" href="${pageLink }">맨뒤</a>
				</li>

			</ul>
		</nav>
	</div>

	<h1>고객 목록</h1>
	<table class="table">
		<thead>
			<tr>
				<th>#</th>
				<th>ID</th>
				<th>CustomerName</th>
				<th>ContactName</th>
				<th>Address</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${customerList }" var="customer" varStatus="status">
				<tr>
					<td>${status.count}</td>
					<td>${customer.id }</td>
					<td>${customer.name }</td>
					<td>${customer.contactName }</td>
					<td>${customer.address }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>