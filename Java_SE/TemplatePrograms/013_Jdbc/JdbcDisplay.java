package com.emertxe;

/**
 * Program Detail: the code is to display all the records from  student table stored in mysql database
 * 
 * Author:Sandhya 
 * Written: 08/03/2016 
 * Last Update:
 * 
 * Compilation: javac JdbcDisplay.java 
 * Execution: java JdbcDisplay
 * Output:
*/
import java.sql.*;
public class JdbcDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			// forName is used to register the driver class
			Class.forName("com.mysql.jdbc.Driver");
			//creating the connection object
			Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			//creating the statement object
			Statement s1 =cn.createStatement();
			ResultSet rs= s1.executeQuery("select *from student");
			while(rs.next())
			{
				System.out.println("Name  :  "+rs.getString(1));
				System.out.println("address  :  "+rs.getString(2))
				;
				
			}
			cn.close();//closing the connection
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
