package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidServlet  extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private static final boolean True = false;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		try { 
			response.setContentType("text/html");  
			    PrintWriter out = response.getWriter();  
			      
			    Cookie c[]= request.getCookies();
			    boolean t = false;
			    if (c == null){
			    	out.println("<h1> You are a new user, kindly login. </h1>");
			    	request.getRequestDispatcher("login.html").include(request, response);
			    	
			    }
			    else {
			    	String name1 = request.getParameter("name");
//			    	String pass1 = request.getParameter("pass");
			    	for (int i = 0 ; i< 8; i++) {
			    		if (c[i].getValue().equals(name1))
               
			    		{
			    	
			    			t = True;
			    			out.println("<h1>Welcome to your profile, " + name1);
			    			out.close();  
			    		}
			    	}
			    	if (t == false) {
			    		out.println("<h1> You are a new user, kindly Register. </h1>");
				    	request.getRequestDispatcher("Question19.html").include(request, response);
			    	}

			    }
		}catch(Exception e){System.out.println(e);}  
			    }  
			      
			  
		}