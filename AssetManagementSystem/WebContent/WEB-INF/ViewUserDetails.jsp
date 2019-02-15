<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>View User Details</title>
<%@page import="java.util.ArrayList,beans.UsersBean"%>
</head>
<body>
	<%@include file="AdminHeader.jsp"%>
	<center>
	<%
	int eid=(Integer)session.getAttribute("eid");
	if(eid==0)
		response.sendRedirect("/");
	%>
		<h1>
			<font color="grey">WELCOME-${email}</font>
			</h2>
	</center>
	<div class="container">
		<table class="table table-bordered">
			<tr>
				<th>Uid</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>EmailId</th>
				<th>Password</th>
				<th>Designation</th>
				<th>Employee Id</th>
				<th>Manager Id</th>
				<th>Support Id</th>
				<th>Date Of Joining</th>
				<th>Mobile No</th>
				<th>Status</th>
			</tr>
			<% 
 ArrayList<UsersBean> list=(ArrayList<UsersBean>)request.getAttribute("LIST");
 %>
 <%
   for(UsersBean ee:list)
   {   
 %>
			<tr>
				<td><%=ee.getUid()%></td>
				<td><%=ee.getFname()%></td>
				<td><%=ee.getLname()%></td>
				<td><%=ee.getEmail()%></td>
				<td><%=ee.getPwd()%></td>
				<td><%=ee.getDesignation()%></td>
				<td><%=ee.getEeid()%></td>
				<td><%=ee.getMmid()%></td>
				<td><%=ee.getSsid()%></td>
				<td><%=ee.getDoj()%></td>
				<td><%=ee.getMobile()%></td>
				<td><%=ee.getActive()%></td>
			<tr/>
 <%
    }
 %>
	</table>
	</div>
</body>
</html>