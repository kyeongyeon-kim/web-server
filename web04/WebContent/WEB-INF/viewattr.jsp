<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>어트리뷰트 값 확인</title>
</head>
<body>
	<p><%= request.getAttribute("first") %></p>
	<!-- el(expression language) -->
	<!-- 기본 객체들을 찾아 순서대로 찾아서 값을 가지고 와서 출력해줌 -->
	<p>el로 출력하기 : ${ first }</p>
</body>
</html>