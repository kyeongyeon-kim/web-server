<%@page import="userinfo.User"%>
<%@page import="java.util.List"%>
<%@page import="userinfo.UserinfoService"%>
<%
UserinfoService repo = new UserinfoService();
List<User> list = repo.selectAllUserinfo();
System.out.println(list);
request.setAttribute("list", list);
request.getRequestDispatcher("/WEB-INF/selectallresult.jsp")
	.forward(request, response);
%>