<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello World</title>
</head>
<body>
<h3>Hello World in Java</h3>
<br>
<%!
String makeItLower(String data){
	return data.toLowerCase();
}
%>
Lower Case "Hello World": <%= makeItLower("Hello World") %>
</body>
</html>