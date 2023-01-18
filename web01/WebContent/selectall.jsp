<%@page import="country.CountryRepository"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.LinkedHashMap"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%
CountryRepository repo = new CountryRepository();
Map<String, Integer> map = repo.selectAll();
request.setAttribute("map", map);
request.getRequestDispatcher("/WEB-INF/country.jsp")
	.forward(request, response);
%>