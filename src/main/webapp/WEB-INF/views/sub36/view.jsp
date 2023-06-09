<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>

	<h5>json -> javaBean</h5>

	<br />
	<button id="btn1">json 전송1</button>

	<br />
	<button id="btn2">json 전송2</button>

	<br />
	<button id="btn3">json 전송3(배열/리스트)</button>

	<br />
	<button id="btn4">json 전송4(리스트)</button>

	<br />
	<button id="btn5">json 전송5(객체안에 객체)</button>

	<br />
	<button id="btn6">json 전송6(객체안에 객체)</button>

	<br />
	<button id="btn7">json 전송7(객체가 아이템인 리스트)</button>

	<hr />

	<input type="text" id="inputName" placeholder="이름" />
	<br />
	<input type="text" id="inputAge" placeholder="나이" />
	<br />
	<button id="btn8">전송</button>
	<br />

	<hr />

	<input type="text" id="inputName2" placeholder="이름" />
	<br />
	<input type="text" id="inputEmail2" placeholder="이메일" />
	<br />
	<input type="text" id="inputScore2" placeholder="점수" />
	<br />
	결혼유무<input type="checkbox" id="inputMarried2" />
	<br />
	<button id="btn9">전송</button>
	<br />

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.4/jquery.min.js" integrity="sha512-pumBsjNRGGqkPzKHndZMaAG+bir374sORyzM3uulLV14lN5LyykqNk8eEeUlUkB3U0M4FApyaHraT65ihJhDpQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>

	<script src="/js/sub36/ajax.js"></script>
</body>
</html>