<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>합 구하기 결과페이지</title>
</head>
<body>
<%
	String param1 = request.getParameter("num1");
	String param2 = request.getParameter("num2");
	if (param1 == null || param2 == null) {
%>
<p>입력값이 없습니다</p>
<%		
	} else {
%>
<p>사용자가 요청한 첫번째 수 : <%= param1 %></p>
<p>사용자가 요청한 첫번째 수 : <%= param2 %></p>
<%
	Integer num1 = Integer.valueOf(param1);
	Integer num2 = Integer.valueOf(param2);
%>
<p>합  <%= num1 + num2 %></p>
<%
	}
%>
</body>
</html>