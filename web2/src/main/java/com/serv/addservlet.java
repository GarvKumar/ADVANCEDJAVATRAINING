package com.serv;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class addservlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
		//public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		System.out.println("sum is " + k);
		
		//1//
		//PrintWriter out=res.getWriter();
	    //out.println("sum is " +k);
		
		//2//
	    k=k*k;
		//3//
		//req.setAttribute("k", k);
		//2//
		RequestDispatcher rd=req.getRequestDispatcher("square");
		rd.forward(req,res);
	}
	
}