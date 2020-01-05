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
		$("#b2").click(function() {
			$.ajax({
				url: "resources/text/dataset.json",
				success: function(result) {
					alert("json과 연결 성공했음.")
					alert(result.length +"명이 있음.")
					for(i = 0; i < 100; i++){
						//console.log(result[i].id)
						//console.log(result[i].email)
						id = result[i].id
						email = result[i].email
						$("#d1").append("-" + id + ", " + email + "<br>")
					}
				}
			})
		})
		
		$("#b1").click(function() {
			$.ajax({
				url: "resources/text/dataset.xml",
				success: function(result) {
					alert("xml과 연결 성공했음.")
				}
			})
		})
	})
</script>
</head>
<body>
<img src="https://musicmeta-phinf.pstatic.net/album/003/735/3735168.jpg?type=r32Fll&v=20191210175907">
<button id="b1">XML문서 읽어오기</button>
<button id="b2">JSON문서 읽어오기</button>
<hr color="red">
<div id="d1"></div>






</body>
</html>