package Sessiontrack;
/*
2.Write a servlet code to do the following
i)Get Userid and parameter values from login.html and set are create cookies of it.
ii)Retrieve these setcookies and verify the user validity from the table
(Assume suitable table structure
*/
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class Cookie
 */
public class CookieSer extends HttpServlet
 {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
	PrintWriter pw = response.getWriter();
	//retreiving data from html page
	String uid =request.getParameter("id");
	String pswd = request.getParameter("pwd");
		
	Cookie ck=new Cookie("psswd", pswd);
	response.addCookie(ck);
	//Forward to Ck2.java
	RequestDispatcher rd = request.getRequestDispatcher("Ck2");
	rd.forward(request, response);
			
   }


}


