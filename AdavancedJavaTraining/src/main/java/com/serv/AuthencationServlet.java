package com.serv;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthencationServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public  void doPost (HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	Cookie c1 = new Cookie("u1",request.getParameter("name1"));
	Cookie c2 = new Cookie("u2",request.getParameter("name2"));
	Cookie c3 = new Cookie("u3",request.getParameter("name3"));
	Cookie c4 = new Cookie("u4",request.getParameter("name4"));
	Cookie p1 = new Cookie("p1",request.getParameter("pass1"));
	Cookie p2 = new Cookie("p2",request.getParameter("pass2"));
	Cookie p3 = new Cookie("p3",request.getParameter("pass3"));
	Cookie p4 = new Cookie("p4",request.getParameter("pass4"));
	
	response.addCookie(c1);
	response.addCookie(p1);
	response.addCookie(c2);
	response.addCookie(p2);
	
	response.addCookie(c3);
	response.addCookie(p3);
	
	response.addCookie(c4);
	response.addCookie(p4);
	
	response.sendRedirect("/AdavancedJavaTraining/login.html"); 
	

	}
}