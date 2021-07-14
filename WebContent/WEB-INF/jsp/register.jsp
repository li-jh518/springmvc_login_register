<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>注册</h1>
		<hr>
		<form action="usersController/register" method="post">
			<table border="2" bordercolor="yellow">
				<tr>
					<td>账号：</td>
					<td><input type="text" name="username" maxLength="10"></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="password" maxLength="12" /></td>
				</tr>
				<tr>

					<td colspan="2"><center>
							<input type="submit" value="注册" /> <input type="reset"
								value="重置" />
						</center></td>
				</tr>
			</table>
		</form>
		<form action="usersController/tologin">
			<table>
				<tr>
					<td colspan="2"><input type="submit" value="返回登录界面" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>