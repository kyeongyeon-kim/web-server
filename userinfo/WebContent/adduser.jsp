<%@page import="userinfo.UserRepository"%>
<%@page import="userinfo.IUserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="userinfo.UserService"%>
<%
	String method = request.getMethod();
	request.setCharacterEncoding("UTF-8");

	if (method.equalsIgnoreCase("get")) {
		request.setAttribute("errorCode", 405);
		request.setAttribute("errorMessage", "지원하지 않는 방식의 요청입니다.");
		request.getRequestDispatcher("errors.jsp")
			.forward(request, response);
// 		response.sendRedirect("error405.jsp");
	} else {
		String email = request.getParameter("email");
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		
		if (email == null || firstName == null || lastName == null) {
			request.setAttribute("errorCode", 400);
			request.setAttribute("errorMessage", "입력 형식이 올바르지 않은 요청입니다.");
			request.getRequestDispatcher("errors.jsp")
			.forward(request, response);
// 			response.sendRedirect("error400.jsp");
		} else {
			IUserService service = new UserService(new UserRepository());
			int result = service.addUser(email, firstName, lastName);
			
			request.setAttribute("message",
			result == 1 ? "회원가입 완료" : "추가 실패");
			request.getRequestDispatcher("/WEB-INF/resultinfo.jsp")
				.forward(request, response);
		}
		
	}
%>