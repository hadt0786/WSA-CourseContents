package Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateTimeServlet extends HttpServlet {

public void doGet(HttpServletRequest req, HttpServletResponse rsp)

throws ServletException, IOException {

rsp.setContentType("text/html");

PrintWriter out = rsp.getWriter();

Date now = new Date(); // The current Date/time

out.println("<html>");

out.println("<head><title> Date Time  </title></head>");

out.println("<body>");

out.println("<p>The Date and Time is: " + now + "</p>");

out.println("</body></html>");

}
}
