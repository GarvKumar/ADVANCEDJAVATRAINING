package com.serv;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class P_No18_Login extends HttpServlet {
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String email=request.getParameter("mail");
			String pas=request.getParameter("pass");
			
			String url="jdbc:mysql://localhost:3306/garv";
			String uname="root";
			String pass=uname;
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,uname,pass); //step3
				String query="select * from user where email=? and password=?";
				
				PreparedStatement ps= con.prepareStatement(query);
				ps.setString(1, email);
				ps.setString(2, pas);
				
				ResultSet rs=ps.executeQuery();
				if(rs.next()==true) {
					out.print("Successfully login");
				}else {
					out.print(" Failed");
				}
			}
				catch (Exception e) {
				out.print(e);
			}
			
		}

	}
