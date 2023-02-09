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

	public class P_No18_Admission extends HttpServlet {
			
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String name=request.getParameter("name");
				String email=request.getParameter("mail");
				String phone=request.getParameter("mobile");
				String course=request.getParameter("course");
				String branch=request.getParameter("branch");
				String s1=request.getParameter("s1");
				String s2=request.getParameter("s2");
				
				String url="jdbc:mysql://localhost:3306/garv";
				String uname="root";
				String pass=uname;
				PrintWriter out=response.getWriter();
				response.setContentType("text/html");
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection(url,uname,pass); //step3
					String sql= "insert into admission values(?,?,?,?,?,?,?)";
					PreparedStatement ps= con.prepareStatement(sql);
					ps.setString(1, name);
					ps.setString(2, email);
					ps.setString(3, phone);
					ps.setString(4, course);
					ps.setString(5, branch);
					ps.setString(6, s1);
					ps.setString(7, s2);
					
					int i=ps.executeUpdate();
					if(i>0) {
						out.print("Successfully Submitted");
					}
					
					String query="select * from admission";
					ResultSet rs=ps.executeQuery(query); //step5
					out.print("\n<table border='2'>");
					out.print("<tr>");
					out.print("<td>Name</td><td>E-Mail</td><td>Phone</td><td>Course</td><td>Branch</td><td>Subject1</td><td>Subject2</td>");
					out.print("</tr>");
			        while (rs.next()) {
			        	out.print("<tr>");
			            out.print("<td>"+rs.getString(1)+ "</td><td>"+ rs.getString(2)+ "</td><td>"+ rs.getString(3)+"</td><td>"+ rs.getString(4)+"</td><td>"+ rs.getString(5)+"</td><td>"+ rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><tr>");
			        }
			        out.print("</table>");
				} catch (Exception e) {
					out.print(e);
				}
				
			}

		}

