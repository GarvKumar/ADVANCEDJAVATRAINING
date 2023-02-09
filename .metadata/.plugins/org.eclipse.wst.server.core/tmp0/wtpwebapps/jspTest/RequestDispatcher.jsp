<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>RequestDispatcher</title>
	</head>
	<body>
	<%
	  RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
	  dispatcher.include(request, response);
	%>
	</body>
	</html>