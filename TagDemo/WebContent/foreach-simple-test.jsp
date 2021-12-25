<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%
	String[] cities = {"Kolkata", "Chennai", "Pune", "Delhi"};
	pageContext.setAttribute("myCities", cities);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>For each tag</title>
</head>
<body>
<c:forEach var="tempcities" items="${myCities}">
	${tempcities}<br>	
</c:forEach>
</body>
</html>