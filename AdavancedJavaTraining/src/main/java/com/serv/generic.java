/**
 * 
 */
package com.serv;

/**
 * @author sajan
 *
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class generic extends GenericServlet
{
	private static final long serialVersionUID = 1L;

@Override
public void service(ServletRequest request, ServletResponse res) throws ServletException, IOException {
	
PrintWriter out = res.getWriter();
out.println("<h1>This is GenericServlet class implementation!</h1>");

}
}