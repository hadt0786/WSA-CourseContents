package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginHttpSessionServlet extends HttpServlet {
	 
	private final String userID = "admin";
    private final String password = "password";
	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            throws ServletException, IOException
	  {
		  // get request parameters for userID and password
		   response.setContentType("text/html");
	        String user = request.getParameter("user");
	        String pwd = request.getParameter("pwd");
	        if(userID.equals(user) && password.equals(pwd)){
	        	HttpSession session = request.getSession();
	            session.setAttribute("user", user);
	            //setting session to expiry in 30 mins
	            session.setMaxInactiveInterval(30*60);
	            response.sendRedirect("LoginSuccess.jsp");
	        }else{
	        	RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
	            PrintWriter out= response.getWriter();
	           out.println("<font color=red>"+"Either user name or password is wrong.</font>");
	            rd.include(request, response);
	         
	        }
	       
	        
	  }
}
