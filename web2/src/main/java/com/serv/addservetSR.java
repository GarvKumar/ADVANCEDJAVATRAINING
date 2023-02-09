package com.serv;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add1")
public class addservetSR extends HttpServlet{
	
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	int i=Integer.parseInt(req.getParameter("num1"));
	int j=Integer.parseInt(req.getParameter("num2"));
	int k=i+j;
	//3//
	Cookie cookie=new Cookie("k",k + "");
	res.addCookie(cookie);
	
	//2//
//	HttpSession session=req.getSession();
//	session.setAttribute("k",k);
	//1///
	//res.sendRedirect("square1?k="+k);//url rewriting
	res.sendRedirect("square1?k="+k);
}
}