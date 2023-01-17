<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정답 페이지</title>
</head>
<body>
	<%
		String answer = request.getParameter("answer");
	if (answer != null) {

		if (answer.equals("2")) {

			out.println("<p>정답입니다.</p>");

		} else {

			out.println("<p>오답입니다.</p>");

		}

	} else {

		out.println("<p>입력값이 없습니다.</p>");

	}
	%>
</body>
</html>