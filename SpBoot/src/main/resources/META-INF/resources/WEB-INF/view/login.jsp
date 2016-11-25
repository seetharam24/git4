<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center><br/><br/><br/><br/><br/><br/><br/>

	<form:form name="login" action="/home" modelAttribute="userForm">
		<table>
			<tr><td>Username:</td><td><form:input type="text" path="userName" name="userName"/></td></tr>
			<tr><td>Password:</td><td><form:input type="password" path="password" name="password"/></td></tr>
			<tr><td colspan="2" align="center"><form:button  value="submit">Sign In</form:button>New User?<a href="/newUser">Register here</td></tr>
		</table>
	</form:form>
</center>

</body>
</html>