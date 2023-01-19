<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 405</title>
</head>
<body>
	<% response.setStatus(405); %>
	<p>해당 메소드 요청을 수행할 수 없습니다.</p>
</body>
</html>