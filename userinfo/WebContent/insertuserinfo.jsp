<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="userinfo.UserinfoService"%>
<%
	String email = request.getParameter("email");
	String firstName = request.getParameter("firstname");
	String lastName = request.getParameter("lastname");
	
	out.println(email);
	out.println(firstName);
	out.println(lastName);
	
	UserinfoService repo = new UserinfoService();
	int result = repo.insertUserinfo(email, firstName, lastName);
	
	request.setAttribute("result", result);
	request.getRequestDispatcher("/WEB-INF/resultinfo.jsp")
		.forward(request, response);
%>