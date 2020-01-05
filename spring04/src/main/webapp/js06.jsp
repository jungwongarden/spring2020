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
			//id값을 가지고 오세요.
			idValue = $("#id").val()
			console.log("당신이 입력한 id는 " + idValue)
			//서버와 통신 필요!
			//$.ajax() 사용하면 됨.
			//url, 전달할 data, 결과처리
			$.ajax({
				url: "member.do",
				data: {
					id : idValue	
				},
				success: function(result) {
					$("#d1").html(result)
				}
			})
			
		})
		$("#b2").click(function() {
			adminValue = $("#admin").val()
			$.ajax({
				url: "admin.do",
				data: {
					admin : adminValue
				},
				success: function(result) {
					$("#d1").html(result)
				}
			})		
			
		})
	})
</script>
</head>
<body>
아이디 입력: 
<input type="text" id="id"><br>
<button id="b1">아이디 중복 체크</button>
<hr color="red">

관리자모드 입력: 
<input type="text" id="admin" name="admin"><br>
<button id="b2">관리자로 로그인</button>
<hr color="red">

<div id="d1"></div>
</body>
</html>


