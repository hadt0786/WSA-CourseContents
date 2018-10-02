<%-- Write JSP code which adds the student education details in a database through Java bean. Also display the student details who have secured first class in their graduation.
--%>
<%@ page language="Java" import="java.sql.*" %>

<html>
<head><title>JSP with Javabeans</title></head>
<body bgcolor="#ffccff">
<h1>JSP using JavaBeans example</h1>
<form name="form1" method="POST" >
  Enter Student ID : <input type="text" name="sid"><br>
  Enter Student name : <input type="text" name="sname"><br>
  Enter Student marks in CoreJava :  <input type="text" name="sjava"><br>
  Enter Student marks in Servlet :  <input type="text" name="sservlet"><br>
  Enter Student marks in Jsp :  <input type="text" name="sjsp"><br>
  <input type = "submit" value="Submit">
  <jsp:useBean id="stu" class="com.emertxe.StudentDetails" scope="page">
  <jsp:setProperty name="stu" property="*"/>
  </jsp:useBean>
</form>
<%stu.insert();%>
</body>
</html>
