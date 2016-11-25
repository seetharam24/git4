<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<title>Insert title here</title>
</head>
<body><center><br/><br/><br/><br/><br/><br/><br/>
	<h1>New User Registration</h1>
	<form:form name="newuser" action="/saveUser" modelAttribute="userForm">
	<table>
		
			<tr><td>User Name:</td><td><form:input type="text"  name="username" path="userName"/></td></tr>
			<tr><td>Password:</td><td><form:input type="password" path="password" name="password"/></td></tr>
			<tr><td>Phone:</td><td><form:input type="text" path="phone" name="phone"/></td></tr>
			<tr><td>Email:</td><td><form:input type="text" path="email" name="email"/></td></tr>
			<tr><td>City:</td><td><form:input type="text" path="city" name="city"/></td></tr>
			<tr><td>State:</td><td><form:input type="text" path="state" name="state"/></td></tr>
			<tr><td>Address:</td><td><form:input type="text" path="address" name="address"/></td></tr>
			<tr><td colspan="2" align="center"><form:button  value="submit">Submit</form:button>Registered user <a href="/login">Sign in here</a></td></tr>
			</table>
		</form:form>
	</center>
</body>
</html>