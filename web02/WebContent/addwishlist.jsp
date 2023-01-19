<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.StringJoiner"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String[] products = request.getParameterValues("product");
	StringJoiner sj = new StringJoiner(",");
		for (String product : products) {
			sj.add(product);
		}
		String text = sj.toString();
		String encoded = URLEncoder.encode(text, "UTF-8");
		Cookie cookieProduct = new Cookie("product", encoded);
		cookieProduct.setMaxAge(60 * 60 * 24);
		response.addCookie(cookieProduct);
		response.sendRedirect("./index.jsp");
%>