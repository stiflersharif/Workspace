<%@ page import="com.jarvis.jsp.*, java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World</title>
</head>
<body>
<h3>Hello World for JSP Demo</h3>

Server Time Stamp is <%= new java.util.Date() %>
<br><br>
Lets have some fun: <%= FunUtils.makeItLower("Hello World") %>
</body>
</html>