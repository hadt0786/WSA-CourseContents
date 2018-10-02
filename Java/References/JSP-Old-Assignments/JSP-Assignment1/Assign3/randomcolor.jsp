<%-- Make a JSP page that always displays the same page content, but uses a background color of green, red, blue, or yellow, randomly chosen 	  for each request. Make sure your page does not use the JSP-Styles style sheet, since that style sheet  overrides the background color 
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%!int randNum; %>
<% int num = 1 + (int)(Math.random() * 10000);
   for(int i = 0; i< num; i++)
   {
    randNum = 1 + (int)(Math.random() * 20000);
   }
%>
<body bgcolor=<%=randNum %>  >
 <h3 align = "center">
This page changes the background color randomly chosen for each request
</h3>
</body>
</html>
