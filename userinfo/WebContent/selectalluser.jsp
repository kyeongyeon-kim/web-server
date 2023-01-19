<%@page import="userinfo.UserRepository"%>
<%@page import="userinfo.User"%>
<%@page import="java.util.List"%>
<%@page import="userinfo.UserService"%>
<%
	UserService repo = new UserService(new UserRepository());
List<User> list = repo.selectAllUserinfo();
System.out.println(list);
request.setAttribute("list", list);
request.getRequestDispatcher("/WEB-INF/selectallresult.jsp")
	.forward(request, response);
%>