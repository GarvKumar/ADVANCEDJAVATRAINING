<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
<%
	String name1 = request.getParameter("name1");
	String pass1 = request.getParameter("pass1");
	String name2 = request.getParameter("name2");
	String pass2 = request.getParameter("pass2");
	String name3 = request.getParameter("name3");
	String pass3 = request.getParameter("pass3");
	String name4 = request.getParameter("name4");
	String pass4 = request.getParameter("pass4");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/garv","root","root");
	Statement stmt=con.createStatement();
	PreparedStatement ps = con.prepareStatement("insert into user values(?,?)");
	ps.setString(1,name1);
	ps.setString(2,pass2);
	ps.executeUpdate();
	ps.setString(1,name2);
	ps.setString(2,pass2);
	ps.executeUpdate();
	ps.setString(1,name3);
	ps.setString(2,pass3);
	ps.executeUpdate();
	ps.setString(1,name4);
	ps.setString(2,pass4);
	ps.executeUpdate();
	//stmt.executeUpdate(sql);
	out.println("Users are registred");
%>
<a href = "/AdvancedJSPProgram/UserLogin.jsp"><button>Click here to Login!</button></a>
</body>
</html>