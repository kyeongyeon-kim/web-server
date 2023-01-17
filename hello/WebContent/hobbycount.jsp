<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>취미생활 개수세기</title>
</head>
<body>
<%
	Map<String, String[]> map = request.getParameterMap();
	String[] values = map.get("hobby");
	if (values != null) {
		out.println(values.length);
		out.println(" 개 선택");
		
		out.println(Arrays.toString(values));
	} else {
		out.println("취미 생활을 선택하지 않으셨습니다.");
	}
%>
</body>
</html>