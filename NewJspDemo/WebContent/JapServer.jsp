<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>built-in objects</title> 
</head>
<body>
<h3> Server objects</h3>
Request user agent: <%=request.getHeader("User-Agent") %>
<br>
Request Language: <%= request.getLocale()%>
</body>
</html>