<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@include file="EmployeeHeader.jsp"%>
<%@page import="beans.AssetBean,java.util.ArrayList" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script type="text/javascript">
</script>

<%
  ArrayList<AssetBean> list=(ArrayList<AssetBean>)request.getAttribute("LIST");
 %>

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
			<form action="CreateRequest" method="post">
				<h2>${msg}</h2>
				<div class="form-group">
					<label for="Assets">Assets:</label>
					 <select name="assets" id="assets">
						<option value="Select">Select</option>
						<%
                          for(AssetBean e:list)
                          {   
                         %>
              <option value="<%=e.getAid()%>#<%=e.getAssets()%>"><%=e.getAid()%>.<%=e.getAssets()%>	</option>
              <%
                          }
					%>
			  </select>
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>