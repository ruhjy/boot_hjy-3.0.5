$("#btn1").click(function() {
	const data1 = $("#input1").val();
	const data2 = $("#input2").val();
	const data = { name: data1, age: data2 };

	$.ajax("/sub40/test", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
});

$("#btn2").click(function() {
	$.ajax("/sub40/test", {
		success: function(data) {
			$("#response1").empty();
			for (let i = 0; i < data.length; i++) {
				console.log(data[i].name);
				$("#response1").text(
				data[i].id + ", " + data[i].name + ", " + data[i].age
				);
}
		}
	});
});