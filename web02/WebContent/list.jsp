<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록 페이지</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	String value = null;
	boolean loginState = false;
	for (int i = 0; i < cookies.length; i++) {
		if (cookies[i].getName().equals("login")) {
			value = cookies[i].getValue();
			loginState = true;
		}
	}
%>
<p><%= value %>님 안녕하세요.</p>
<p>이 페이지는 목록 페이지임</p>
<form action="addwishlist.jsp">
<%
	if (loginState == true) {
%>
	<label><input type="checkbox" name="product" value="playstation"/><img src="./image/playstation.webp">플레이스테이션</label>
	<label><input type="checkbox" name="product" value="nintendo"/><img src="./image/nintendo.webp">닌텐도</label>
	<label><input type="checkbox" name="product" value="gameboy"/><img src="./image/gameboy.webp">게임보이</label>
	<label><input type="checkbox" name="product" value="xbox"/><img src="./image/xbox.webp">엑스박스</label>
	<input type="submit"/>
<% 		
	} else {
%>
	<ol>
		<li><img src="./image/playstation.webp">플레이스테이션</li>
		<li><img src="./image/nintendo.webp">닌텐도</li>
		<li><img src="./image/gameboy.webp">게임보이</li>
		<li><img src="./image/xbox.webp">엑스박스</li>
	</ol>
<%
	}
%>
</form>
</body>
</html>