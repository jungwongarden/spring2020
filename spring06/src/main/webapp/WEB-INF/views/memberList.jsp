<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원 전체 리스트입니다.</h3>
	<hr color="red">
	<c:forEach var="dto" items="${list}">
		<hr color="red"> 
		당신의 검색 id: ${dto.id} <br>
		당신의 검색 pw: ${dto.pw} <br>
		당신의 검색 name: ${dto.name} <br>
		당신의 검색 tel: ${dto.tel} <br>
	</c:forEach>
</body>
</html>


