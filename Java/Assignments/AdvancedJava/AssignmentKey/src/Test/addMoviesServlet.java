package Test;

//Write a web application that allows you to add new movies to an ArrayList and lists all the movies
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addMoviesServlet extends HttpServlet 
{
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
  {
	PrintWriter out=response.getWriter();
	ArrayList <String> lstMovies=new ArrayList <String>();
	response.setContentType("text/html"); 
	Scanner input =new Scanner(System.in);
    System.out.println("Enter your Movie Name: ");
    String newMovieName =input.nextLine(); 
	try
	{
		//adding movies to the ArrayList
		lstMovies.add("Jaiho");
		lstMovies.add("chennaiExpress");
		lstMovies.add("Bommarillu");
		lstMovies.add(newMovieName);
		//out.println("Movie name added to arraylist  " + str1);
		out.println("<html>");

		out.println("<head><title> List of Movies:  </title></head>");

		out.println("<body>");

		out.println("<p>List of Movie Names: " + lstMovies + "</p>");

		out.println("</body></html>");
	}

	catch (Exception e) 
	{ 
		throw new ServletException(e.toString()); 
	} 
  } 
}