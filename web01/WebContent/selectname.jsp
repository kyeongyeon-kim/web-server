<%@page import="java.util.Map"%>
<%@page import="country.CountryRepository"%>
<%
	String name = request.getParameter("name");

	CountryRepository repo = new CountryRepository();
	Map<String, Integer> map = repo.selectByName(name);
	
	request.setAttribute("map", map);
	request.getRequestDispatcher("/WEB-INF/country.jsp")
		.forward(request, response);
%>