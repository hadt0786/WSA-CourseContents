<%-- Write JSP code to display list of blood donors with details for particular blood group.--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@page import="java.sql.*;"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lightcyan">
<h1 align="center">Blood Donor Details</h1>
<%! String grp; %>
<%grp=request.getParameter("bgroup"); 
	try
	{
		//Register the Driver
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		//Establish the database Connection
   		Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","oracle");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from BloodGroup where bgroup= '" + grp + "'");
%>
	     <table border="2" align="center" cellpadding="20">
	     <tr><th>DonorName</th><th> BloodGroup</th><th>email-id</th>
	     <th>cellno</th></tr>
  <%
	    while(rs.next())
	    {
  %>
		<tr>
		<td><%=rs.getString("name") %></td>
		<td><%=rs.getString("bgroup") %></td>
		<td><%=rs.getString("email") %></td>
		<td><%=rs.getInt("cellno") %></td>
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
</ul>
</body>
</html>
