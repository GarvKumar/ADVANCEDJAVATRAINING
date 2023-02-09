<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>solution 29</title>
</head>
<body>
<h3>
<%
String name = request.getParameter("name");
out.println("Welcome to the jsp page "+name);
%>
</h3>
</body>
</html>