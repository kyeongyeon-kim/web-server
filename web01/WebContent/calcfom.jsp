<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>간단한 웹 계산기</title>
</head>
<body>
<form action="calcresult.jsp">
	<input type="number" name="first"/>
	<select name="operator">
		<option value="plus">+</option>
		<option value="minus">-</option>
		<option value="mul">*</option>
		<option value="div">/</option>
	</select>
	<input type="number" name="second"/>
	<input type="submit"/>
</form>
</body>
</html>