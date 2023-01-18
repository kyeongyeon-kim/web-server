<%@page import="java.util.ArrayList"%>
<%@page import="userinfo.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 결과</title>
</head>
<body>
<a href="index.html">처음으로</a>
<ul>
<%	
	List<User> list = (ArrayList) request.getAttribute("list");
	for (User user : list) {
%>
	<li><%= user.toString() %></li>
<%
	}
%>
</ul>
</body>
</html>