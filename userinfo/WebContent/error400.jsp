<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 400</title>
</head>
<body>
	<% response.setStatus(400); %>
	<p>잘못된 요청입니다.</p>
</body>
</html>