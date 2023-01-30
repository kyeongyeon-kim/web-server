<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="web06.MyContextListener"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터소스 연결 확인 페이지</title>
</head>
<body>
<%
	try (Connection conn = MyContextListener.getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT 1");
			ResultSet rs = stmt.executeQuery()) {
		if (rs.next()) {
			out.println(rs.getInt(1) == 1);
		}
	}
			
%>
</body>
</html>