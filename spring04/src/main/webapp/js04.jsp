<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() {
		$("#b1").click(function() {
			//이미지 추가.
			img = "<img src=resources/img/car.png width=150 height=150>"
			$("#d1").append(img + "<br>")
		})
		$("#b2").click(function() {
			//댓글 입력한것 가지고 옴
			re1 = $("#re1").val()
			//d1에 붙여 넣음.
			$("#d1").append(re1 + "<br>")
		})
		$("#b3").click(function() {
			//댓글쓴거 가지고 옴
			re2 = $("#re2").val()
			img = "<img src=resources/img/car.png width=50 height=50>"
			$("#d1").append(img)
			$("#d1").append(re2 + "<br>")
		})
	})//jquery close!
</script>
</head>
<body>
<button id="b1">이미지 추가하기</button><br><br>
댓글 입력1: <input type="text" id="re1">
<button id="b2">댓글 추가하기</button><br><br>
댓글 입력2: <input type="text" id="re2">
<button id="b3">댓글+이미지 추가하기</button><br><br>
<hr color="red">
<div id="d1"></div>






</body>
</html>