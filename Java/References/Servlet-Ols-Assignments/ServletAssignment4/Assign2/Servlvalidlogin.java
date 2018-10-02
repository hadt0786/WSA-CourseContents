package Sessiontrack;
/*
Create a login page to validate user name and password entered by the user(user name is-park and password is-asd123 ). If the user does not enter the correct username and password then a error message should come(“username and password is incorrect”).
*/
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlvalidlogin extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body> <h1 align='center'> Login Page</h1>");
		String uname = request.getParameter("name");
		String pwd = request.getParameter("pswd");
		//Checking username and password.
		if(uname.equals("park") && pwd.equals("asd123"))
		{
			pw.println("<h3> Username exists </h3>");
			
		}
		else
		{
			pw.println("<h3> Username and Password is Incorrect</h3>");
		}
		pw.println("</body></html>");
	
	}


}
