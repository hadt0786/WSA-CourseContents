<%-- Write a JSP program to explain session handling. --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!String sid,sname,scellno; %>
<%
 	sid =  request.getParameter("sid");
	sname = request.getParameter("sname");
 	scellno = request.getParameter("scellno");
	//Using HttpSession to set the attribute values
	HttpSession sess = request.getSession(true);
	sess.setAttribute("id", sid);
	sess.setAttribute("name", sname);
	sess.setAttribute("cellno", scellno);
	//Forward request to sessiontrack2.java
	RequestDispatcher rd = request.getRequestDispatcher("sessiontrack2.jsp");
	rd.forward(request, response);
%>
</body>
</html>
