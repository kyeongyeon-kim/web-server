<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>추가 페이지</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	String value = null;
	for (int i = 0; i < cookies.length; i++) {
		if (cookies[i].getName().equals("login")) {
			value = cookies[i].getValue();
		}
	}
%>
<p><%= value %>님 안녕하세요.</p>
<p>이 페이지는 추가 페이지임</p>
</body>
</html>
