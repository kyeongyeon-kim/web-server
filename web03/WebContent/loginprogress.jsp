<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- 톰캣이 jsp파일을 읽을 때 읽기 쉽게 하기위한 힌트를 주기 위함  -->
<%
	// request 바디에 정보가 담겨 올 수 있는데 이 때 브라우저에서 요청한 정보들이 HTML폼에서 결정된 인코딩셋으로 서버로 날라오는데 이 때 같은 인코딩셋을 해주기 위함 임
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	//getSession(false) 없으면 안만들고  null값 주기
	//getSession(true) 없으면 새로 만들어 주기
	
	if (id.length() > 0 && password.equals("admin")) {
		// jsp에서 기본객체로 session이라는 안보이는 변수가 존재함
		// HttpSession session = request.getSession();
		// 그렇기에 기본 객체로 접근이 가능하다.
		session.setAttribute("login", id);
	}
	response.sendRedirect("./index.jsp");
%>