<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니 초기화</title>
</head>
<body>
<%
	Cookie c = new Cookie("product", "");
	c.setMaxAge(0);
	response.addCookie(c);
%>
<p>장바구니가 초기화되었습니다.</p>
<a href="index.jsp">처음으로</a>
</body>
</html>