$("#button1").click(function() {
	$.ajax("/sub35/link1", { method: "post" })
});

$("#button2").click(function() {
	$.ajax("/sub35/link2", { method: "post" })
});

$("#button3").click(function() {
	$.ajax("/sub35/link3", {
		method: "post",
		data: "name=손"
	})
});

$("#button4").click(function() {
	$.ajax("/sub35/link4", {
		method: "post",
		data: "address=korea&price=3.14"
	})
});

$("#button5").click(function() {
	$.ajax("/sub35/link5", {
		method: "post",
		data: "name=park&score=9.9&email=abc@a.com"
	})
});

$("#button6").click(function() {
	$.ajax("/sub35/link6", {
		method: "post",
		data: "address=korea&product=pizza&price=9.9"
	})
});


/* json */
$("#button7").click(function() {
	$.ajax("/sub35/link7", {
		method: "post",
		data: '{"name": "son"}',
		contentType: "application/json"
	})
});

$("#button8").click(function() {
	$.ajax("/sub35/link8", {
		method: "post",
		data: '{"address": "korea", "name": "홍길동"}',
		contentType: "application/json"
	})
});

$("#button9").click(function() {
	$.ajax("/sub35/link9", {
		method: "post",
		contentType: "application/json",
		data: '{"name":"hjy", "age":33, "married":false}'
	})
});

$("#button10").click(function() {
	$.ajax("/sub35/link10", {
		method: "post",
		contentType: "application/json",
		data: '{"address":null, "age":30, "name":"손흥민"}'
	})
});

$("#button11").click(function() {
	$.ajax("/sub35/link11", {
		method: "post",
		contentType: "application/json",
		data: '{"book":{"title":"java", "price":300}, "address":"seoul"}'
	})
});

$("#button12").click(function() {
	$.ajax("/sub35/link12", {
		method: "post",
		contentType: "application/json",
		data: '{"food":["pizza", "coke", "coffee"], "store":"피자스쿨"}'
	})
});

