$("#button1").click(function() {
	$.ajax("/sub34/link1");
});

$("#button2").click(function() {
	$.ajax("/sub34/link2");
});

$("#button3").click(function() {
	$.ajax("/sub34/link3?name=son");
});

$("#button4").click(function() {
	$.ajax("/sub34/link4?address=korea");
});

$("#button5").click(function() {
	$.ajax("/sub34/link5?name=손&age=33");
});

$("#button6").click(function() {
	$.ajax("/sub34/link6?food=김밥&price=3000");
});

$("#button7").click(function() {
	$.ajax("/sub34/link7?address=seoul&name=park&age=33");
});

$("#button8").click(function() {
	$.ajax("/sub34/link8?product=keyboard&category=computer&price=30000");
});