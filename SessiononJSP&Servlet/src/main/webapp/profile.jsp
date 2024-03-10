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
String name=(String) session.getAttribute("name_key");
%>
<h2>WelCome:<%= name %></h2>
<a href="home.jsp">Home</a>
<a href="about-us.jsp">About us</a>
<a href="logout">LogOut</a>
</body>
</html>