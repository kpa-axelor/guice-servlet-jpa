<html>
<body>
	<form action="UpdateData" method="POST">
		id: <input type="text" name="id" value= <%= request.getParameter("empid") %> ><br />
		 First Name: <input type="text" name="name" value=<%= request.getParameter("empname") %>> 
		 <br /> 
		 marks : <input type="number" name="marks" value=<%= request.getParameter("empmarks")%>  /> 
			<input type="submit" value="update" name="update" />
			 <input type = "submit" value = "delete" name ="delete" />
	</form>
</body>
</html>