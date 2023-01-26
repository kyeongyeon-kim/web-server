<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출력을 할 때 사용할 수 있는 el 표현들</title>
</head>
<body>
	<p>연산 : ${ 1 + 1 }</p>
	<!-- 약간 다른 문자열 결합 방법 -->
	<p>문자열 결합 : ${ "문자열" += "결합" }</p>
	<p>수 + 문자열 : ${ 22 + "22" }</p>
	<hr>
	<p>관계연산 : ${ 55 == 55 }</p>
	<p>문자열 eq : ${ "문자열1" == "문자열1" }</p>
<%-- 	<p>문자열 compare : ${ "문자열1" > "문자열1" }</p> --%>
	<hr>
	<p>논리연산 : ${ true && true }</p>
	<hr>
	<!-- empty연산자 : 우측에 있는 값이 비어있다면 ? (null/ 빈문자열/ 원소가 없는 배열or컬렉션) true -->
	<p>empty : ${ empty null }</p>
</body>
</html>