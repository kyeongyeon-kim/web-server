<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
<!-- 	해당하는 파일 내용이 액션 주소로 요청 > 메소드 방식 post(주소라는 곳에 이진데이터표현 힘듦) > 인코딩타입(http 스펙때문에/ 파일은 url형태로 요청이 어렵기때문) -->
	<form action="./file/upload" method="post" enctype="multipart/form-data">
		<input type="file" name="upload" /> 
		<input type="submit" />
	</form>
</body>
</html>