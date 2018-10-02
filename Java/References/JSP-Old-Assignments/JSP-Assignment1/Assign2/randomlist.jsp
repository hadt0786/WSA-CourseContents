<%-- Make a JSP page that makes a bulleted list with a random number of entries in the list,
     each of which is a random int
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
</head>
<body bgcolor="lightblue">
<font color = "red">
<h1 align="center">Random Bullet List</h1></font>
<h3>
<ul>
<% int num = 1 + (int)(Math.random() * 20);
   for(int i = 0; i< num; i++)
   {
     int randNum = 1 + (int)(Math.random() * 20);
     out.println("<li>" + randNum);
   }
%>
</ul>
</h3>
</body>
</html>
