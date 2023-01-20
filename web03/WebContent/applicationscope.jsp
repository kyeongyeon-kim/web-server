<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 더 넓은 공간에서 사용가능한 객체 -->
<html>
<head>
<meta charset="UTF-8">
<title>어플레이케이션 scope 어트리뷰트 목록</title>
</head>
<body>
<%
	// 웹 어플리케이션 객체의 범위는 구동되는 동안에 계속해서 사용가능한 객체
	Enumeration<String> attrNames = application.getAttributeNames();
	while (attrNames.hasMoreElements()) {
		String name = attrNames.nextElement();
		out.println("<p>" + name + " : ");
		// 구동시키기 위한 설정값들이 담겨있음 name에
		out.println(application.getAttribute(name) + "</p>");
	}
%>
</body>
</html>