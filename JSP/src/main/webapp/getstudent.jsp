<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
		<legend>STUDENT DETAIL</legend>
		<form action="./savestudent1.jsp" method="post">
		<table>
			<tr>
			   <td><label>NAME:</label></td>
			   <td><input type="text" name="name"></td>
			</tr>
			<tr>
			   <td><label>EMAIL:</label></td>
			   <td><input type="email" name="email"></td>
			</tr>
			<tr>
			   <td><label>CONTACT:</label></td>
			   <td><input type="contact" name="contact"></td>
			</tr>
			<tr>
			   
			   <td><input type="submit" name="submit"></td>
			</tr>
			
		</table>

	</form>



</body>
</html>