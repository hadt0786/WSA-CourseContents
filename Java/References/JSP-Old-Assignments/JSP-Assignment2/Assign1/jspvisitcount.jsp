<%-- Write JSP Script which accepts user name and nick name from user. At first visit,  display message “Hello user name” and for next 	       successive requests, display “Hello nick name”. Use username if visit count is odd and nick name if visit count is even. 
  	(use declaration scripting elements)
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!Integer count; %>
<%
        count = (Integer)application.getAttribute("count");
        if (count == null)
        {
            count = new Integer(1);
        }
        else
        {
            count= new Integer(count.intValue() + 1);
        }

        application.setAttribute("count", count);

        if(count%2==0)
        {
              out.println("This is an Even Visit <br> Hello : "+request.getParameter("nname"));
        }
        else
        {
              out.println("This is an Odd Visit <br> Hello : "+request.getParameter("uname"));
        }
       out.println("Visit Count:"+count);
%>
</body>
</html>
