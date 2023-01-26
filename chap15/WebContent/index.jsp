<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인덱스</title>
</head>
<body>
	<nav>
<!-- 		if else절처럼 사용이 가능한 choose문 -->
		<c:choose>
		<c:when test="${ not empty memberid }">
			<a href="list.jsp">방명록</a>
			<a href="logout.jsp">로그아웃</a>
		</c:when>
		<c:otherwise>
			<a href="./insert/insertForm.jsp">회원가입</a>
			<a href="login.jsp">로그인</a>
		</c:otherwise>
		</c:choose>
	</nav>
</body>
</html>