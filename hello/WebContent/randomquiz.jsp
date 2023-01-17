<%@page import="java.util.Random"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>랜덤한 퀴즈</title>
</head>
<body>
<%
	List<String> quiz = new ArrayList<>();
	quiz.add("더글로리 주요인물(송혜교)의 배역명?");
	quiz.add("더글로리 스트리밍 서비스?");
	quiz.add("더글로리 시절 문동은에게 학교폭력을 가해한 주동자?");
	
	Random r = new Random();
	int number = r.nextInt(3);
	String text = quiz.get(number);
%>
<p><%= text %></p>
<form action="randomanswer.jsp">
	<input type="text" name="answer" placeholder="정답을 입력하세요.">
	<input type="hidden" name="number" value="<%= number %>" readonly />
	<input type="submit">
</form>
</body>
</html>