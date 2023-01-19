<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String rememberid = request.getParameter("rememberid");
	
	if (id.equals("admin") && password.equals("admin")) {
		Cookie  login = new Cookie("login", id);
		response.addCookie(login);
		
		if (rememberid != null) {
			Cookie cookieRemember = new Cookie("rememberid", id);
			cookieRemember.setMaxAge(60 * 60 * 24);
			response.addCookie(cookieRemember);
		}
		
		response.sendRedirect("./index.jsp");
	} else {
		response.sendRedirect("./login.jsp");
	}
%>