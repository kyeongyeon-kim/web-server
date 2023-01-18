<%@ page language="java" pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	request.setAttribute("attr1", "문자열 값");
	request.setAttribute("attr2", 55);
	request.setAttribute("attr3", true);
	
	request.getRequestDispatcher("getreqattr.jsp")
	// 기존에 사용하고 있던 기본객체를 그대로 다음페이지로 전달해줌 (새 요청 객체를 만들면 안되니까)
		.forward(request, response);
%>