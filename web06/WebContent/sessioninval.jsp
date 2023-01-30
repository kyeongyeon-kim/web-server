<%@page import="com.mysql.cj.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 만료</title>
</head>
<body>
<% HttpSession session = request.getSession(false);
	if (session != null) {
		session.invalidate();
		session = request.getSession();
	}
%>
</body>
</html>