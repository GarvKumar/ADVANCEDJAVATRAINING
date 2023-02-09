package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet{
 
	 public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		//3// 
		int k=(int)req.getAttribute("k");
		 
		//k=k*k;
		 //2//
		 PrintWriter out=res.getWriter();
			//out.println("hello to Square");
		//3//
		out.println(k);
	 }
	
}