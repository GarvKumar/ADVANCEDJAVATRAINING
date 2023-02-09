<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Solution 32</title>
</head>
<body>
<h3>32.	Write a JSP program to select record from database.
</h3>
<%
	String dbDriver = "com.mysql.cj.jdbc.Driver";
	String dbURL = "jdbc:mysql:// localhost:3306/garv";	
	// Database name to access
	String dbUsername = "root";
	String dbPassword = "root";
	Class.forName(dbDriver);
	Connection con = DriverManager.getConnection(dbURL,dbUsername, dbPassword);
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from employee");
%>	
<h3>
<% 
while(rs.next())
	{
		out.println(rs.getInt(1)+" "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getDouble(4)+"<br>");
		}
%>
</h3>

</body>
</html>