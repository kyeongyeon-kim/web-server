<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
	
	<form action="./file/upload" method="post" enctype="multipart/form-data">
		uploader : <input type="text" name="name" />
		<input type="file" name="upload" /> 
		<input type="submit" />
	</form>
</body>
</html>