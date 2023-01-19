<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 하기</title>
</head>
<body>
	<form action="adduser.jsp" method="post">
	<input type="email" name="email" maxlength="60"  placeholder="email" required/>
	<input type="text" name="firstname" maxlength="15" placeholder="firstName" required/>
	<input type="text" name="lastname" maxlength="15" placeholder="lastName" required/>
	<input type="submit"/>
	</form>
</body>
</html>