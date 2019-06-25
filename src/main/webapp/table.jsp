
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="guiceservlet.Employee"%>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
<table style = "width:50%">
<h2>Employee information</h2>
<%
	List<Employee> employeeList = (List<Employee>)request.getAttribute("employeeL");
	%>	<tr><td><%out.print("id"); %></td><td><%out.print("name"); %></td><td><%out.print("marks"); %></td>
		</tr>
	

		<%
	for (Employee employee : employeeList) {
		%>
			<form action = "update.jsp" method ="POST">
		<tr>
		<td><input type = "text" value = "<% out.print( employee.getId() ); %>" name = "empid"></td>
		<td><input type ="text" value = "<% out.print( employee.getName());%>" name ="empname"></td>
		<td><input type = "text" value ="<% out.print(employee.getMarks());%>" name = "empmarks"> </td>
		
		<td> <input type="submit" value=" Edit " name="edit"/></td>
		
		<td> <input type="submit" value="Delete" name = "delete"/></td>
		</tr>
		</form>
	<% } %>
	 <form action = "UpdateData" method = "POST">
         Enter id : <input type = "number" name = "id" />
      	 Name: <input type = "text" name = "name">
         <input type = "submit" value = "update" name ="update" />
            <input type = "submit" value = "delete" name ="delete" />
      </form>
</table>
</body>
</html>

