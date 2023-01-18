<%@page import="java.util.Map"%>
<%@page import="country.CountryRepository"%>
<%
	String continent = request.getParameter("continent");

	CountryRepository repo = new CountryRepository();
	Map<String, Integer> map = repo.selectByContinent(continent);
	
	request.setAttribute("map", map);
	request.getRequestDispatcher("/WEB-INF/country.jsp")
		.forward(request, response);
%>