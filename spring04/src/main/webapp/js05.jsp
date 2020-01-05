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
			id = $("#id").val()
			console.log("당신이 입력한 id는 " + id)
			list = ["root", "admin", "manager"]
			result = "사용할 수 있는 아이디입니다."
			for(i = 0; i < 3; i++){
				if(id == list[i]){
					result = "아이디가 이미 사용중입니다."
				}				
			}
			$("#d1").html(result)
		})
		$("#b2").click(function() {
			admin = $("#admin").val()
			if(admin == "admin"){
				$("#d1").html("관리자 모드로 로그인 ok")
			}else{
				$("#d1").html("관리자 모드로 로그인 not")
			}
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
<input type="text" id="admin"><br>
<button id="b2">관리자로 로그인</button>
<hr color="red">

<div id="d1"></div>
</body>
</html>


