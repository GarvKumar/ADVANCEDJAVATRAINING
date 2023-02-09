<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Operations !!</title>
</head>
<body>

<%
	float num1 = Float.parseFloat(request.getParameter("num1"));
	float num2 = Float.parseFloat(request.getParameter("num2"));
	out.print("<br>");
	out.println("Sum of the two numbers :"+(num1+num2));
	out.print("<br>");
	out.println("Subtraction of the two numbers :"+(num1-num2));
	out.print("<br>");
	out.println("Multiplication of the two numbers :"+(num1*num2));
	out.print("<br>");
	out.println("Division of the two numbers :"+(num1/num2));
%>

</body>
</html>