package Sessiontrack;
//Write a program to display multiple values from single prameter?

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetParameterValues extends HttpServlet
{
  protected void doPost(HttpServletRequest request,HttpServletResponse response)  throws ServletException, IOException
  {
  	response.setContentType("text/html");
  	PrintWriter pw = response.getWriter();
  	String[] choc = request.getParameterValues("Choclate");
  	for (int i = 0; i < choc.length; i++)
  	{
  		pw.println("<br>Choclate : " + choc[i]);
  	}
  }
}
