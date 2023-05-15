$("#btn1").click(function() {
	$.ajax("/sub39/link1", {
		success: function() {
			console.log("성공");
		},
		error: function() {
			console.log("실패");
		},
		complete: function() {
			console.log("성공이든 실패든 호출");
		}
	});
});

$("#btn2").click(function() {
	$.ajax("/sub39/link2", {
		success: function() {
			console.log("성공");
		},
		error: function() {
			console.log("실패");
		},
		complete: function() {
			console.log("성공이든 실패든 호출");
		}
	});
});

$("#btn3").click(function() {
	$.ajax("/sub39/link3", {
		success: function() {
			// 성공(200) 응답을 받아서 콘솔에 "성공!!!!!" 출력
			console.log("성공!!!!!");
		}
	});
});

$("#btn4").click(function() {
	$.ajax("/sub39/link4", {
		error: function() {
			// 실패(500) 응답을 받아서 콘솔에 "실패!!!!!" 출력
			console.log("실패!!!!!");
		}
	});
});

$("#btn5").click(function() {
	$.ajax("/sub39/link1")
		.done(function() {
			console.log("done 메서드 사용, 성공!!!!!")
		})
		.fail(function() {
			console.log("fail 메서드 사용, 실패!!!!!")
		})
		.always(function() {
			console.log("always 메서드 사용, 항상!!!!!")
		});
});

$("#btn6").click(function() {
	$.ajax("/sub39/link2")
		.done(function() {
			console.log("done 메서드 사용, 성공!!!!!")
		})
		.fail(function() {
			console.log("fail 메서드 사용, 실패!!!!!")
		})
		.always(function() {
			console.log("always 메서드 사용, 항상!!!!!")
		});
});

$("#btn7").click(function() {
	$.ajax("/sub39/link3")
		.done(function() {
			console.log("***성공*** done");
		})
		.always(function() {
			console.log("always");
		});
});

$("#btn8").click(function() {
	$.ajax("/sub39/link4")
		.fail(function() {
			console.log("===실패=== fail");
		})
		.always(function() {
			console.log("always");
		});
});

$("#btn9").click(function() {
	$.ajax("/sub39/link9", {
		success: function(data) {
			console.log("링크9 성공");
			console.log(data);
		}
	});
});

$("#btn10").click(function() {
	// 응답본문(현재시간) 이 콘솔에 출력
	$.ajax("/sub39/link10", {
		success: function(time) {
			$("#res10").text(time);
		}
	});
});

$("#btn11").click(function() {
	$.ajax("/sub39/link11", {
		success: function(data) {
			$("#res11").text(data.name + ", " + data.age);
		}
	});
});

$("#btn12").click(function() {
	$.ajax("/sub39/link12", {
		success: function(data) {
			$("#link12res1").text(data.address);
			$("#link12res2").text(data.city);
			$("#link12res3").text(data.phone);
		}
	});
});

$("#btn13").click(function() {
	$.ajax("/sub39/link13", {
		success: function(data) {
			for (let i = 0; i < data.length; i++) {
				$("#link13res" + i).text(data[i]);
			}
		}
	});
});

$("#btn14").click(function() {
	const cid = $("#categoryIdInput").val();

	$.ajax("/sub39/link14?cid=" + cid, {
		success: function(data) {
			//console.log(data);
			$("#res14").empty();
			for (let i = 0; i < data.length; i++) {
				$("#res14").append(data[i].name + "<br>");
			}
		}
	});
});

$("#btn15").click(function() {
	const cid = $("#categoryIdInput").val();

	$.ajax("/sub39/link14?cid=" + cid, {
		success: function(data) {
			$("#res15").empty();
			$("#res15").append(`
				<table class="table">
					<thead>
						<tr>
							<th>상품명</th>
							<th>가격</th>
						</tr>
					</thead>
				</table>
			`);
			$("#res15 > .table").append("<tbody />");
			for (let i = 0; i < data.length; i++) {
				$("#res15 tbody")
					.append(`
						<tr>
							<td>${data[i].name}</td>
							<td>${data[i].price}</td>
						</tr>
					`);
			}
		}
	});
});


























