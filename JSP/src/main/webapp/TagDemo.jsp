<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Array"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
%<%!List<Integer> list =new ArrayList(); %>
%<% list.add(1); 
	list.add(2); 
	list.add(3); 
	list.add(4); 
	list.add(5); %>
 <%!   %>

</body>
</html>