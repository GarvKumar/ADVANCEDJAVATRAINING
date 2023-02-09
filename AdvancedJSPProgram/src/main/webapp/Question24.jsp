<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question 24</title>
</head>
<body>
<h2>24.	Write a JSP program to upload file into server.</h2>

<form action = "MultiPartServlet" method = "post" enctype = "multipart/form-data">
	<input type = "file" name = "file" multiple >
	<input type = "submit" value = "upload">


</form>

</body>
</html>