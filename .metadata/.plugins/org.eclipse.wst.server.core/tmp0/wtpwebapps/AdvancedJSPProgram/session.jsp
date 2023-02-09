<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogIn Page</title>
</head>
<body>

<%
String uname = request.getParameter("uname");
String pass = request.getParameter("pass");
session.setAttribute("uname",uname);
out.println("Session is set!!");
%>
<br>
<a href = "login.jsp"><button>Click To Login</button></a>

</body>
</html>