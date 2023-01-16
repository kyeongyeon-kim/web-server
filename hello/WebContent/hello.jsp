<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
<!-- 동적 페이지가 왜 필요할까? 그때그때 서비스가 달라야하기때문에 -->
	<h1>Hello world!</h1>
	<p><%= 100 + 100 %></p>
	<p><%= 20.0 / 4.0 %></p>
	<p><%= "문자열" + "합" %></p>
</body>
</html>