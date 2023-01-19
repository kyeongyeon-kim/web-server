<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	Cookie login = null;
	boolean loginState = false;
	for (int i = 0; i < cookies.length; i++) {
		if (cookies[i].getName().equals("login")) {
			loginState = true;
		}
	}
%>
	<a href="list.jsp">아이템 목록</a>
<% 
	if (loginState == true) {
%>
	<a href="wishlist.jsp">장바구니 보기</a>
<%	
	} 
	if (loginState == true) {
%>
	<a href="logout.jsp">로그아웃</a>
<%	
	} else {
%>	
	<a href="login.jsp">로그인</a>
<%		
	}
%>
</body>
</html>