//Write a program to get the init parameter values from web.xml file.
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class MyServlet extends HttpServlet 
{

   public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
   {
     res.setContentType("text/plain");
     PrintWriter out = res.getWriter();
     out.println("Init Parameters:");
     Enumeration e = getInitParameterNames();
     while (e.hasMoreElements())
    {
      String name = (String) e.nextElement();
      out.println(name + ": " + getInitParameter(name));
    }
  }
}
