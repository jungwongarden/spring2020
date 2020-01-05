<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="multi">
	<h1>회원가입 화면입니다.</h1>	
	<hr color="red">
	아이디 : <input type="text" name="id"><br>
	패스워드 : <input type="text" name="pw"><br>
	이름 : <input type="text" name="name"><br>
	연락처 :<select name="tel">
			<option value="sk telecom">SK
			<option value="lg telecom">LG
			<option value="kt telecom">KT
			<option value="ect telecom">ETC
		</select> 
		<select name="no1">
			<option value="010">010
			<option value="011">011
			<option value="017">017
			<option value="018">018
		</select>
		<input type="text" name="no2" placeholder="000-0000">
		<br>
		성별: <input type="radio" value="man" name="gender">남자
		<input type="radio" value="woman" name="gender">여자
		<br>
		취미: <input type="checkbox" value="run" name="hobby">달리기
			<input type="checkbox" value="read" name="hobby">독서
			<input type="checkbox" value="swim" name="hobby">수영
			<input type="checkbox" value="computer" name="hobby">컴퓨터
		<br>
		하고 싶은 말: <textarea rows="5" cols="30">here..</textarea>
		<br>
		<button type="submit">회원가입 처리</button>
	</form>
</body>
</html>




