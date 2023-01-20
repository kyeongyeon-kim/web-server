<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 값 확인</title>
</head>
<body>
	<%= session.getAttribute("login") %>
	<%
		Date d1 = new Date(session.getCreationTime());
		Date d2 = new Date(session.getLastAccessedTime());
	%>
	<br/>
	<p>세션 id<%= session.getId() %></p>
	<p>세션 생성 시간<%= d1 %></p>
	<p>세션 마지막 접근 시간<%= d2 %></p>
</body>
</html>