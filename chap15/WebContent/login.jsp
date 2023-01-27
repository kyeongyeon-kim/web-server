<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 해주세요</title>
</head>
<body>
	<c:if test="${ param.result == 'fail' }">
		<p>아이디 비밀번호를 확인해주세요.</p>
	</c:if>
	<!-- 임의의 주소를 , 존재하지않는 자원으로 맵핑해서 서블릿에 이 요청처리흐름을 넘기는 방법 -->
	<form action="./loginprogress" method="post">
		<input type="text" name="memberid">
		<input type="password" name="password">
		<input type="submit">
	</form>
	<a href="index.jsp">[Index]</a>
</body>
</html>