<%@page import="java.io.BufferedReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리 페이지</title>
</head>
<body>
<%
	// id 파라미터값 : admin
	// password 파라미터값 : root
	// 일때 로그인 성공(메시지 출력)

	// 이외 실패 
	// 실패시 로그인 페이지로 이동할 수 있는 링크 제공
	/*
	out.println(request.getMethod());
	out.println(request.getQueryString()); // get
	try (BufferedReader br = request.getReader()) {
		String line = br.readLine();
		out.println("<p>바디에서 읽은 내용: " + line + "</p>");
	}*/
	String id = request.getParameter("id");
	String password = request.getParameter("password");

	if (id == null || password == null) {
		out.println("<p>잘못된 접근 방식입니다.</p>");
	} else {
		if (id.equals("admin") && password.equals("root")) {
			out.println("<p>로그인 완료</p>");
		} else {
			out.println("<p>로그인 실패</p>");
			out.println("<a href='login.html'>재로그인 하시겠습니까?</a>");
		}
	}
	%>
</body>
</html>