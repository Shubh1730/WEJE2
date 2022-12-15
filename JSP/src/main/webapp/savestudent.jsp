<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html;
 charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String contact = request.getParameter("contact");

Connection connection;
PreparedStatement preparedStatement;
int result= 0 ;
String driverpath = "com.mysql.cj.jdbc.Driver";
String dburl = "jdbc:mysql://localhost:3306/jsp";
String query = "insert into  studentdetail values(?,?,?)";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student registration form:</title>
</head>
<body>
	<fieldset>
		<legend>STUDENT DETAIL</legend>
		<table>
			<tr>
				<td><label>NAME:</label></td>
				<td><%=name%></td>
			</tr>
			<tr>
				<td><label>EMAIL:</label></td>
				<td><%=email%></td>
			</tr>
			<tr>
				<td><label>CONTACT:</label></td>
				<td><%=contact%></td>
			</tr>
		</table>

	</fieldset>
	<%
	  	try{
	  		Class.forName(driverpath);
	  		connection = DriverManager.getConnection(dburl,"root","root");
	  		preparedStatement.setString(1, name);
	  		preparedStatement.setString(2, email);
	  		preparedStatement.setString(3, contact);
	  		result = preparedStatement.executeUpdate();
	  		if(result !=0){
	  			
	  %>
	  <h3><%=result%>row(s) affected</h3>
	  <%
	  	}
	  	}catch(Exception e){
	  		 %>
	  		 <%=e %>>
	  		 <%	
	  	}

	%>

</body>
</html>