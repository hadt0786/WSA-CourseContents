package Sessiontrack;
/* Create a customer registration application with html and store the data into database and display the data from database erifying the name and password .
*/
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class Registration extends HttpServlet
{
	int i;
	Connection con;
	Statement st;
	ResultSet rs;
	int userid, accno, lastuserid, lastaccno;
	String query1 = "Select max(userid) from bankuser";
	String query2 = "Select max(accno) from account_info_table";
	ServletConfig config;

	public void init(ServletConfig config) throws ServletException
	{
		this.config = config;
		try
		{
			//register the driver and establish the connection
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","oracle");
		
			   
		}
		catch(Exception e)
		{
			System.out.println("\nError :"+e); 
			e.printStackTrace();
		}
	}


	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		String y = config.getInitParameter("msg");
				
		writer.println("<html>");
		writer.println("<head><title>Servlet Program for inserting user details</title></head>");
		writer.println("<body bgcolor='pink'>");
		writer.println(y);

		try
		
		{
			st = con.createStatement();
			rs = st.executeQuery(query1);
			if(rs.next())
				lastuserid = rs.getInt(1);
			userid = lastuserid + 1;

			st = con.createStatement();
			rs = st.executeQuery(query2);
			if(rs.next())
				lastaccno = rs.getInt(1);
			accno = lastaccno + 1;

			String fname=req.getParameter("cust_first_name");
			String lname=req.getParameter("cust_last_name");
			String acctype=req.getParameter("acc_type");
			String password = req.getParameter("user_password");
			String address = req.getParameter("addressbox");
			String city = req.getParameter("city");
			String pin = req.getParameter("pin");
			String profession = req.getParameter("Profession");
			String emailid = req.getParameter("email");
			String gender = req.getParameter("R1");
			String day = req.getParameter("dob");
			String month = req.getParameter("month");
			String year = req.getParameter("year");
			String date = (day+"/"+month+"/"+year);
			System.out.println();
		
			st= con.createStatement();
			i = st.executeUpdate("insert into bankuser values("+userid+",'"+password+"','U','A')");
		
			st = con.createStatement();
			i= st.executeUpdate("insert into account_info_table values("+userid+" , "+accno+" , '"+acctype+"', 0)");

			st = con.createStatement();
			i = st.executeUpdate("insert into user_personal_info values("+userid+",'"+fname+"','"+ lname +"','"+emailid+"','"+ 					gender +"','"+ date +"','"+address+"','"+city+"','"+pin+"','"+profession+"')");
		
			writer.println("<h1>The details for the user have been added successfully..!</h1>");
			
			st = con.createStatement();
			ResultSet rss = st.executeQuery("select * from user_personal_info");
			while(rss.next())
			{
				writer.println("userid = "+ rs.getInt(1));
				writer.println("fname = "+rs.getString(2));
				writer.println("gender = "+rs.getString(5));
				
			}
		}

		catch(Exception e)
		{
			writer.println("<h1>The details have not been updated due to some operation problem..!</h1>");
			System.out.println("\nError :"+e); 
			e.printStackTrace();
		}
	}
}
