
<%-- Write JSP code to search a student placement details from the placement database by student id --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
     <%@page import="java.sql.*;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Student Placement Details</h1>
<%! String id; %>
<%id=request.getParameter("sid"); 
	try
	{
		//Register the Driver
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		//Establish the database Connection
   		Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Placement","root","oracle");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from placementdetails where id= '" + id + "'");
%>
		<table border="2" align="center" cellpadding="20">
	    	 <tr><th>id</th><th> name</th><th>CompanyPlaced</th><th>salary/annum</th>
	   	 </tr>
 <%

		while(rs.next())
		{
 %>
		 <tr>
		 <td><%=rs.getInt("id") %></td>
		 <td><%=rs.getString("name") %></td>
		 <td><%=rs.getString("companyplaced") %></td>
		 <td><%=rs.getInt("salaryperannum") %></td>
		 </tr>
 <%
 		}
  %>
		</table>
  <%
	  
	}
	catch(Exception e)
	{
	
	}
  %>
	     
	
</body>
</html>
