package Sessiontrack;
/*3. Write a servlet program for accepting registration details of a singer for singing competition and store in the database table and if the record already exists, display appropriate message.*/
import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SingerDet extends HttpServlet
 {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		Connection con;
		Statement stmt;
		ResultSet rs;
		PreparedStatement pst;
		int flag=1;
		
		PrintWriter pw = response.getWriter();
		String sname = request.getParameter("name");
		String saddress = request.getParameter("address");
		String scellno = request.getParameter("cellno");
		String semail = request.getParameter("email");
		try
		{
			//Register the Driver
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			//Establish the database Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","oracle");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from singer");
			
			while(rs.next())
			{
				//checking email is already registerd or not
				if(semail.equalsIgnoreCase(rs.getString("email")))
				{
					flag=0;
				}
				
			}
			if(flag==0)
			{
				pw.println("Singer is already registered"); 
			}
			else
			{
				pst=con.prepareStatement("insert into singer values(?,?,?,?)");
				 
				  pst.setString(1, sname);
				  pst.setString(2, saddress);
				  pst.setString(3, scellno);
				  pst.setString(4, semail);
				  pst.executeUpdate();
				  System.out.println("You are succesfully registered");
			
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}


}
