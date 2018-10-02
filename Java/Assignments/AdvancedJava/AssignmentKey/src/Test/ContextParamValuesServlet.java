package Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextParamValuesServlet  extends HttpServlet { 
	public void service( HttpServletRequest req, HttpServletResponse res ) 
			throws ServletException, IOException { 
	res.setContentType("text/html"); 
	PrintWriter pw = res.getWriter(); // obtain an object of ServletConfig interface 
	ServletConfig config = getServletConfig();   // to read all values 
	pw.println("Reading all values:" + "<br>"); 
	ServletContext ctx = config.getServletContext();	
	Enumeration e = ctx.getInitParameterNames();
	
	// ctx.getAttributeNames()
	while(e.hasMoreElements()) { 
		String name = (String) e.nextElement(); // returns the <param-name> 
		String value = ctx.getInitParameter(name); // returns <param-value> 
		pw.println("<br>" + name + " : " + value ); 
	} 
//	// to read one value (not all) and use in code 
//	String str1 = config.getInitParameter("mangoCost"); 
//	String str2 = config.getInitParameter("numberOfMangoes");   
//	// parsing code 
//	double mc = Double.parseDouble(str1); 
//	int nom = Integer.parseInt(str2);   
//	pw.println("<hr>Reading one value:" + "<br><br>"); 
//	pw.println("One mango cost: " + mc/nom);   // to use getServletConfig() method 
//	pw.println("<hr>Servlet Name: " + config.getServletName()); // prints <servlet-name> of web.xml file. In this case hello 
	pw.close();
} 
}
