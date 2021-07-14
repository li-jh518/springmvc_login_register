<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>登陆成功！！！！！！！！！！</h1>
		<hr>
		<h3>欢迎${requestScope.user.username }登录</h3>
		<table width="100%" height="350px" border="2" bordercolor="blue">
		<c:forEach items="${usersList}" var="user">
				<tr>
					<td align="center">${user.username}</td>
					<td align="center">${user.password}</td>
				</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>