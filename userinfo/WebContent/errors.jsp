<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러페이지</title>
</head>
<body>
<% Integer code = (Integer) request.getAttribute("errorCode");
   String message = (String) request.getAttribute("errorMessage");
   response.setStatus(code);
%>
	<p><%= code %> 에러 발생</p>
	<p>요청한 주소 : <%= request.getRequestURI() %></p>
	<p><%= message %></p>
</body>
</html>