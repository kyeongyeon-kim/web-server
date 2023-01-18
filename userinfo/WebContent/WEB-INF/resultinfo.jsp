<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 결과</title>
</head>
<body>
<%	
	Integer result = (Integer) request.getAttribute("result");
	if (result == 1) {
		out.println("<p>회원가입이 완료되었습니다.</p>");
	} else {
		out.println("<p>회원가입에 실패하였습니다.</p>");
	}
%>
<a href="index.html">처음으로</a>
</body>
</html>