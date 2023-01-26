<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과</title>
</head>
<body>
	<c:if test="${ not empty memberid }">
		<p>${ memberid }님 환영합니다. </p>
		<a href="./">[인덱스로 돌아가기]</a>
	</c:if>
</body>
</html>