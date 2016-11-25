<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
	<h1>Welcome User! ${userName}       &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <a href="/start">Sign Out</a></h1></center>
	<br/><br/><br/><br/><br/><br/>
	<a href="/checkBal">Check Balance</a><br/>
	<a href="/loadFundsTransfer">Funds Transfer</a><br/>
	<a href="/loadUpdateProfile">Update Profile</a><br/>
	<a href="/loadOtherServcies">Other Services</a><br/>
</body>
</html>