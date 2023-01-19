<%@page import="java.util.Arrays"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니 페이지</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	Cookie product = null;
	for (int i = 0; i < cookies.length; i++) {
		if (cookies[i].getName().equals("product")) {
			product = cookies[i];
		}
	}
	if (product == null){
		out.println("장바구니가 비어있습니다.");
	} else {
	String encoded = product.getValue();
	String text = URLDecoder.decode(encoded, "UTF-8");
	String[] split = text.split(",");
%>
<ol>
<%
	for (int i = 0; i < split.length; i++) {
		 out.println("<li>" + split[i] + "</li>"); 
	}
%>
</ol>

<a href="clearwish.jsp">장바구니 비우기</a>
<%		
	}
%>	
<a href="index.jsp">처음으로</a>
</body>
</html>