package Sessiontrack;
//Write a servlet which will display the count of number of times a client has accessed it.
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class ServletAccess extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
	  response.setContentType("text/html");
	  PrintWriter pw = response.getWriter();
  	  HttpSession session = request.getSession(true);

	  Integer count=(Integer)session.getValue("tracker.count");
	  if(count==null)
 	  {
		count=new Integer(1);
	  }
	  else
	  {
		count=new Integer(count.intValue()+1);
	  }
		session.putValue("tracker.count",count);
		pw.println("<html><title>Session Counts</title><body>");
		pw.println("<br><h3>The servlet has been"+count+((count.intValue()==1)?"time":"Times")+"accessed since loaded<h3>");
		pw.println("</body></html>");
		pw.close();
	}
}
