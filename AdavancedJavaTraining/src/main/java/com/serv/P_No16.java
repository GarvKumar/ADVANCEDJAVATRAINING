package com.serv;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P_No16 extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="jdbc:mysql://localhost:3306/garv";
		String uname="root";
		String pass="root";
		String query="select * from user";
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass); //step3
			Statement st=con.createStatement(); //step4
			ResultSet rs=st.executeQuery(query); //step5
			out.print("<table border='2'>");
			out.print("<tr>");
			out.print("<td>Name</td><td>Password</td><td>E-Mail</td><td>Phone</td>");
			out.print("</tr>");
	        while (rs.next()) {
	        	out.print("<tr>");
	            out.println("<td>"+rs.getString(1)+ "</td><td>"+ rs.getString(2)+ "</td><td>"+ rs.getString(3)+"</td><td>"+ rs.getString(4)+"</td></tr>");
	        }
	        out.print("</table>");
	        st.close();
	        con.close();
		}
		catch (Exception e) {
			out.print(e);
		}  
		
	}

}

