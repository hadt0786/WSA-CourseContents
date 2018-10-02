package Sessiontrack;
/*
Write a servlet that will take a string and show the reverse in the same form. This way you can continuously submit and see the string reversed over and over. Every other reversal should show the string forwards
*/
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Strreversesame extends HttpServlet 
{
	
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
     {
		
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	pw.println("<html> <body><form>");
	pw.println("Enter the String: <input type='text' name='name' value=>");
	String str = request.getParameter("name");
	StringBuffer strr = new StringBuffer(str);
	//Reversing the string	
	pw.println(strr.reverse());
	pw.println("<Br><input type='submit' value='submit'>");
     }

}
