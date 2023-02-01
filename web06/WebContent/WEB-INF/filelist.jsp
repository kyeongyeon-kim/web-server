<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 목록</title>
</head>
<body>
	<ul>
		<c:forEach var="e" items="${ files }">
			<c:url var="u" value="./download">
				<c:param name="id" value="${ e.key }"/>
			</c:url>
			<li><a href="${ u }"> ${ e.value }</a></li>
		</c:forEach>
	</ul>
</body>
</html>