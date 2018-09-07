<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="hw" method="post">
		<input type="text" name="username"/>
		<br>
		<input type="password" name="psw"/>
		<br>
		<input type="submit" value="登录"/>
	</form>
	<h3>${requestScope.message}</h3>
</body>
</html>