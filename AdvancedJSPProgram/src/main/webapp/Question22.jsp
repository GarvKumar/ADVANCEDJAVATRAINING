<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Solution No. 21</title>
</head>
<body>


<% 
	String mystr = request.getParameter("mystring");
	out.println("<h2>This is the Entered String : "+mystr);
%>
</body>
</html>