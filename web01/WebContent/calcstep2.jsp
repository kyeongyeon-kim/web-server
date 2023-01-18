<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산 결과 페이지2</title>
</head>
<body>
<%
	Integer result = (Integer) request.getAttribute("result");
%>
	<p>연산 결과 <%= result %></p>
</body>
</html>