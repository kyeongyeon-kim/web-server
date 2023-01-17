<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산 결과</title>
</head>
<body>
<%
		String first = request.getParameter("first");
	String operator = request.getParameter("operator");
	String second = request.getParameter("second");

	Integer num1 = Integer.valueOf(first);
	Integer num2 = Integer.valueOf(second);

	if (operator.equals("div") && num2 == 0) {
		response.sendRedirect("./calcfom.jsp");
	} else {
		int result = 0;
		if (operator.equals("plus")) {
			result = num1 + num2;
		} else if (operator.equals("minus")) {
			result = num1 - num2;
		} else if (operator.equals("mul")) {
			result = num1 * num2;
		} else if (operator.equals("div")) {
			result = num1 / num2;
		}
	
%>
	<p>연산 결과 <%= result %></p>
	</body>
	</html>
<%
	}
%>