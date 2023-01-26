<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트 원소 나열</title>
</head>
<body>
<c:if test="${ not empty list }">
	<c:forEach var="item" items="${ list }">
	<p>${ item }</p>
	</c:forEach>
</c:if>
</body>
</html>