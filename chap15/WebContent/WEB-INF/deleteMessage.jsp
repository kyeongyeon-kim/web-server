<%@ page import="guestbook.service.InvalidPasswordException"%>
<%@ page import="guestbook.service.DeleteMessageService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 메시지 삭제함</title>
</head>
<body>
	${ message }
	<br/>
<a href="./list">[목록보기]</a>
</body>
</html>