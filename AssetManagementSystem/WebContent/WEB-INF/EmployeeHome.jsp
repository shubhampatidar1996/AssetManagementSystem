<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Home</title>
</head>
<body>
<%@include file="EmployeeHeader.jsp"%>
	<center>
	<%
	String email=(String)session.getAttribute("email");
	if(email==null)
		response.sendRedirect("/");
	%>
		<h1>
			<font color="grey">WELCOME-${email}</font>
		</h1>
	</center>
</body>
</html>