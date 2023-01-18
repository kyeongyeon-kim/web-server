<%@page import="java.util.Map"%>
<%@page import="java.util.Map.Entry"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>국가 명</title>
</head>
<body>
<ul>
<%	
	Map<String, Integer> map = (Map) request.getAttribute("map");
	for (Entry<String, Integer> e : map.entrySet()) {
%>
	<li><%= e.getKey() %> = <%= e.getValue() %></li>
<%
	}
%>
</ul>
</body>
</html>