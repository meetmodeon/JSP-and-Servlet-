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
String myname1=(String) session.getAttribute("name_key");
%>
<h2>WelCome to Home page : <%= myname1 %></h2>
<a href="profile.jsp">Profile</a> &nbsp;&nbsp;
<a href="about-us.jsp">About us</a>
</body>
</html>