<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
request.setAttribute("request_name", "Meet ZenBook");
 //out.println(request.getAttribute("request_name"));

%>
<h3>Hello: ${requestScope.request_name }</h3>
<%
session.setAttribute("session_cname", "Mr.Meet");

%>
<h2>Company Name: ${session_cname }</h2>

<form action="output1.jsp" method="get">
<input type="text" name="name1" placeholder="Enter name">
<input type="submit" value="Click me">

</form>

</body>
</html>