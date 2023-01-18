<%@page import="java.util.List"%>
<%@page import="country.CountryRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>대륙명 골라</title>
</head>
<body>
<%
	CountryRepository repo = new CountryRepository();
	List<String> list = repo.distinctContinent();
%>
<form action="selectcontinent.jsp">
	<select name="continent">
<%
	for (String continent : list) {
%>	
	<option><%= continent %></option>
<% 		
	}
%>
	</select>
	<input type="submit" />
</form>
</body>
</html>