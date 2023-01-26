<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세 가지 어트리뷰트 값 확인</title>
</head>
<body>
	<!-- 표현식같은 경우 값이 없다면 Null값 출력 -->
	<p><%= request.getAttribute("random") %></p>
	<p><%= request.getAttribute("myname") %></p>
	<p><%= request.getAttribute("bool") %></p>
	<hr/>
	<!-- el의 경우 값이 없다면 값을 출력하지 않음 -->
	<p>el로 출력하기 : ${ random }</p>
	<p>el로 출력하기 : ${ myname }</p>
	<p>el로 출력하기 : ${ bool }</p>
</body>
</html>