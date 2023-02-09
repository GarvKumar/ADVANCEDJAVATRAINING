package com.serv;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square1")
public class SquareServletSR extends HttpServlet{
 
	 public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	 { 
		 int k=0;
		 Cookie cookies[]=req.getCookies();//as many cookies	 
		 
		 for(Cookie c:cookies)
		 	{
			 	if(c.getName().equals("k"))
				 k=Integer.parseInt(c.getValue());
					 
		 }
		 
		//4//
//			HttpSession session=req.getSession();
//			session.removeAttribute("k");
			
			//int k=(int)session.getAttribute("k");
			 
			//3// 
//	 		int k=Integer.parseInt(req.getParameter("k"));
			 
			 k=k*k;
			 //2//
			 PrintWriter out=res.getWriter();
			 out.println("hello to Square");
			//3//
			 out.println("res is " + k);
		
			 
			 System.out.println("hello");
	 }
		
}
		 
