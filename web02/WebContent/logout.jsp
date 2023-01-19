<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
<%
	Cookie c = new Cookie("login", "");
	c.setMaxAge(0);
	response.addCookie(c);
%>
<p>로그아웃되었습니다.</p>
<a href="index.jsp">처음으로</a>
</body>
</html>