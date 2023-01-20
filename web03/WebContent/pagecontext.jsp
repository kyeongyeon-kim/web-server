<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageContext</title>
</head>
<body>
<%	
	// jsp 기본객체 중 하나인 pageContext
	// Context는 필요한 정보들의 모음이다.
	ServletRequest req = pageContext.getRequest();
	ServletResponse resp = pageContext.getResponse();
	HttpSession ss = pageContext.getSession();
	// 작은 단위부터 찾아감 request > session > application
	req.setAttribute("myAppDb", "Oracle");
%>
 <p>동일 요청 객체 ? : <%= request == req %></p>
 <p>어트리뷰트 찾기 : <%= pageContext.findAttribute("myAppDb") %></p>
</body>
</html>