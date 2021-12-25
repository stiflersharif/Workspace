<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<c:set var="username" value="${Username}"></c:set>
<h1 align="center">Welcome to the HomePage ${username}</h1> <br><br><br>

<h3 align="center">List of Students</h3><br>


<table border="1">
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
	</tr>
	<c:forEach var="temp" items="${students}">
	<tr>
		<td>${temp.firstName}</td>
		<td>${temp.lastName}</td>
		<td>${temp.email}</td>
	</tr>
	</c:forEach>
</table>	


</body>
</html>