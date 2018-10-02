package Sessiontrack;
/*4. Write a program to develop a online application for purchase Laptop using servlet, jdbc.
(Hint: use http session). Create a database which store Laptop name, cost, screensize, ramcapacity,  totallaptops.*/
import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LapDet2 extends HttpServlet
 {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Connection con;
		PreparedStatement pst = null;
		ResultSet rs;
		HttpSession sess=request.getSession(true);
		PrintWriter pw=response.getWriter();
		try
		{
			//Register the driver
			 Class.forName("com.mysql.jdbc.Driver").newInstance();
			//Establish connection to database
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","oracle");
			 String name = (String) sess.getAttribute("lpname");
			 int cst = (Integer) sess.getAttribute("lpcost");
		   	 int size = (Integer) sess.getAttribute("lpsize");
		   	 int capacity = (Integer) sess.getAttribute("lpcapacity");
			//Storing the values to database using PreparedSatatement
			 pst=con.prepareStatement("insert into Laptop values(?,?,?,?)");
			 pst.setString(1,name);
			 pst.setInt(2, cst);
			 pst.setInt(3, size);
			 pst.setInt(4, capacity);
			 pst.executeUpdate();
			 pw.println("success");
		}
		catch(Exception e)
		{
			pw.println("\nError :"+e); 
			e.printStackTrace();
		}
	}


}
