<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB 연결 테스트 페이지</title>
</head>
<body>
<%	
	// jsp에서 발생하는 예외들은 다 throws된다 톰캣에게
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
	stmt = conn.prepareStatement("SELECT 1");
	rs = stmt.executeQuery();
	
	rs.next();
	int result = rs.getInt(1);
	out.println(result == 1);
	
	rs.close();
	stmt.close();
	conn.close();
%>
</body>
</html>