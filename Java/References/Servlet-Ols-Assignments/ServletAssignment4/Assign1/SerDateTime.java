package Sessiontrack;
//1. Write a servlet that shows the current date and time.

import java.io.*;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SerDateTime extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body><h1>Date and Time</h1>");
		pw.println("<h3>");
		pw.println(new Date());
		pw.println("</h3></body></html>");
	
	}
}
