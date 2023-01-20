<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>어플리케이션 기본 객체 어트리뷰트 설정하기</title>
</head>
<body>
<%
	application.setAttribute("myAppDb", "MySql");
	application.setAttribute("mySetting", "mySettingValue");
%>
	<p>어플리케이션 기본 객체 어트리뷰트 설정</p>
</body>
</html>