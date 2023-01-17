<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>랜덤 문제 정답 확인</title>
</head>
<body>
<%
	String answer = request.getParameter("answer");
	String number = request.getParameter("number");

	Map<String, String> map = new HashMap<>();
	map.put("0", "문동은");
	map.put("1", "넷플릭스");
	map.put("2", "박연진");

	String rightAnswer = map.get(number);
	if (answer != null && !answer.isEmpty()) {
		if (rightAnswer.equals(answer)) {
			out.println("<p>정답입니다.</p>");
		} else {
			out.println("<p>오답입니다.</p>");
		}
	} else {
		out.println("<p>정답을 입력해주세요.</p>");
	}
%>
</body>
</html>