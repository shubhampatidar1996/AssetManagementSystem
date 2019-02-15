<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="AdminHeader.jsp"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script type="text/javascript">
</script>
<body>
	<center>
	<%
	int eid=(Integer)session.getAttribute("eid");
	if(eid==0)
		response.sendRedirect("/");
	%>
		<h1>
			<font color="grey">WELCOME-${eid}</font>
		</h1>
	</center>
	<div class="container">
		<div class="col-sm-3">
			<form action="AddAssets" method="post">
				<h2>${msg}</h2>
				<div class="form-group">
					<label for="assets">Assets:</label>
					 <select name="assets" id="assets">
						<option value="select">Select</option>
						<option value="laptop">Laptop</option>
						<option value="tab">Tab</option>
						<option value="projector">Projector</option>
						<option value="tab">Tab</option>
						<option value="laptop">Laptop</option>
						<option value="pendrive">Pendrive</option>
						<option value="sim">SIM</option>
						<option value="pendrive">Pendrive</option>
					</select>
				</div>
				<div class="form-group">
					<label for="act">Status:</label> <input type="text"	class="form-control" id="Status" name="status" required="required" />
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>