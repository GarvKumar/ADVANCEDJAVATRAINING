<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%
Directive tag --><%@page import="java.util.*,java.util.Random" %> 
 < errorPage="error.jsp">-->
 <%@page import="java.sql.*"%>
package garv;

import java.sql.*;  //step 1

public class jdbcclass {
	public static void main(String []args) throws Exception
	{

	String url="jdbc:mysql://localhost:3306/garv";
	String uname="root";
	String pass="root";
	String query="select name from student where id=1";
	Class.forName("com.mysql.cj.jdbc.Driver");//step 2 class forname telusko
	Connection con=DriverManager.getConnection(url,uname,pass); //step3
	Statement st=con.createStatement(); //step4
	ResultSet rs=st.executeQuery(query); //step5

	rs.next();
	String name=rs.getString("name");
	System.out.println(name);//step6

	st.close();
	con.close();//step7
	
	}


}
 