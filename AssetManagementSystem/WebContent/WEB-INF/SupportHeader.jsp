<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
response.addHeader("pragma","no-cache");
response.addHeader("cache-control","no-store");
response.addHeader("expire","0");
%>
<head>
<title>Support Header</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-light" style="background-color:#D4E6F1;">
	<div class="container-fluid">
		<ul class="nav navbar-nav">
			<li><a href="SupportHome"><b>Home</b></a></li>
			<li><a href="Reports"><b>Reports</b></a></li>
			<li><a href="ViewRequest"><b>View Request</b></a></li>
			<li><a href="ChangePassword"><b>Change Password</b></a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="Logout"><span class="glyphicon glyphicon-log-out"></span> <b>Logout</b></a></li>
		</ul>
	</div>
	</nav>
	</body>
	</html>