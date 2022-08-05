<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <script type="text/javascript" src="static/js/al.js"></script> -->
</head>
<body>
	<form action="registuser" method="post">
	<table>
		<tr>
			<td>用户名：</td>
			<td><input type="text" name="uname">
					
			</td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="text" name="password">
			</td>
		</tr>

		<tr>
			<td></td>
			<td><input type="submit" value="注册"></td>
		</tr>
	</table>
	</form>
	
</body>
</html>