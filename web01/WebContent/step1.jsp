<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Random r = new Random();
	int number = r.nextInt();
	
	request.setAttribute("number", number);
	request.getRequestDispatcher("/WEB-INF/step2.jsp")
		.forward(request, response);
%>