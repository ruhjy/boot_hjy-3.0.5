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
	const obj = { name: "son" };

	$.ajax("/sub35/link7", {
		method: "post",
		// data: '{"name": "son"}',
		data: JSON.stringify(obj),
		contentType: "application/json"
	})
});

$("#button8").click(function() {
	const data = {
		address: "korea",
		name: "홍길동"
	};

	$.ajax("/sub35/link8", {
		method: "post",
		// data: '{"address": "korea", "name": "홍길동"}',
		data: JSON.stringify(data),
		contentType: "application/json"
	})
});

$("#button9").click(function() {
	const data = {
		name: "hjy",
		age: 33,
		married: false
	};

	$.ajax("/sub35/link9", {
		method: "post",
		contentType: "application/json",
		// data: '{"name":"hjy", "age":33, "married":false}'
		data: JSON.stringify(data)
	})
});

$("#button10").click(function() {
	const obj = {
		address: null,
		age: 30,
		name: "손흥민"
	};

	$.ajax("/sub35/link10", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	})
});

$("#button11").click(function() {
	const obj = {
		book: {
			title: "java",
			price: 300
		},
		address: "seoul"
	};

	$.ajax("/sub35/link11", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	})
});

$("#button12").click(function() {
	const obj = {
		food: [
			"pizza",
			"coke",
			"coffee"
		],
		store: "피자스쿨"
	};

	$.ajax("/sub35/link12", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	})
});

$("#button13").click(function() {
	const obj = ["pizza", "coke", "coffee"];

	$.ajax("/sub35/link13", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	})
});

$("#button14").click(function() {
	const obj = [
		{
			name: "강백호",
			position: "파워포워드"
		},
		{
			name: "서태웅",
			position: "스몰포워드"
		},
		{
			name: "송태섭",
			position: "포인트가드"
		}
	];

	$.ajax("/sub35/link14", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	})
});