package com.serv;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetDetailsServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String number = request.getParameter("number");
		
		PrintWriter out = response.getWriter();
		out.println("<h1> Name : "+name);
		out.println("<h1> password : "+pass);
		out.println("<h1> Mobiel Number : "+number);

		
		
}
}
