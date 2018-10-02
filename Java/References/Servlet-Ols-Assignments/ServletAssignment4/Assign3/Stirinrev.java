package Sessiontrack;
//Write a servlet that will take a string and show its reverse
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Stirinrev extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw=response.getWriter();
		String str = request.getParameter("name");
		StringBuffer strr = new StringBuffer(str);
		pw.println("Original String is "+ str);
		pw.println("Revese of string is " + strr.reverse());
	}

}
