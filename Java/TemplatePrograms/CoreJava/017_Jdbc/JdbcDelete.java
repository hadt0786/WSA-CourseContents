package com.emertxe;

/**
 * Program Detail: the code is to delete   records from   student table 
 * 
 * Author:Sandhya 
 * Written: 08/03/2016 
 * Last Update:
 * 
 * Compilation: javac JdbcDelete.java 
 * Execution: java JdbcDelete
 * Output:
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","root");
			//PreparedStatment is used to execute parameterized query
			//we are passing parameter(?) for the values
			PreparedStatement ps =cn.prepareStatement("delete from student where address=?");
		
			
			ps.setString(1, "patna");
			
			int i =ps.executeUpdate();
			System.out.println("records deleted");
			ps.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
