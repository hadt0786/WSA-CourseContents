package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleMVC  extends HttpServlet {
	 
	 @Override
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	 throws ServletException, IOException {
	 
	
	String message = req.getParameter("message");

	
	 SampleMVC1  sampleMVC1 = new SampleMVC1();
	 
	String retrunMessage = sampleMVC1.getMessage(message);
	
	//PrintWriter out = resp.getWriter();
	
	req.setAttribute(message, retrunMessage);
	RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
	
	rd.forward(req,resp);
	
	
	
	

}
}
