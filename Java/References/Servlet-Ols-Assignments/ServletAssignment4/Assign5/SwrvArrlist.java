package Sessiontrack;
//Write a web application that allows you to add new movies to an ArrayList and lists all the movies
import java.io.*;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class SwrvArrlist extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
	PrintWriter pw=response.getWriter();
	ArrayList <String> str1=new ArrayList <String>();
	HttpSession session = request.getSession(true); 
	response.setContentType("text/html"); 
	try
	{
		//adding movies to the ArrayList
		str1.add("Jaiho");
		str1.add("chennaiExpress");
		str1.add("Bommarillu");
		pw.println("Movie name added to arraylist  " + str1);
	}

	catch (Exception e) 
	{ 
		throw new ServletException(e.toString()); 
	} 
    } 
}
