<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
<!-- 브라우저가 로그인정보를 담고있는 방법 = 쿠키 -->
<%
	Cookie[] cookies = request.getCookies();
	String rememberid = "";
	for (int i = 0; i < cookies.length; i++) {
		if (cookies[i].getName().equals("rememberid")) {
			rememberid = cookies[i].getValue();
		}
	}
%>
<form action="loginprogress.jsp">
	<input type="text" name="id" placeholder="ID" value="<%= rememberid %>" required/>
	<input type="password" name="password" placeholder="password" required/>
	<label for="savaid">아이디저장<input type="checkbox" name="rememberid"/></label>
	<input type="submit"/>
	</form>
</body>
</html>