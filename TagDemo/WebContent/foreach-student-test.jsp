<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.*,com.jarvis.jsp.tagdemo.Student" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	List<Student> data = new ArrayList<>();
	data.add(new Student("jhon","doe",false));
	data.add(new Student("sharif","jamil",false));
	data.add(new Student("kayenaat","jamil",true));
	
	pageContext.setAttribute("myStudents", data);	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student data</title>
</head>
<body>
<table border="1">
	<tr>
		<th>FirstName</th>
		<th>Last Name</th>
		<th>Gold Customer</th>
	<c:forEach var="temp" items="${myStudents}">
	<tr>
		<c:if test="${temp.goldCustomer}">
			<td>${temp.firstName}</td> <td>${temp.lastName}</td> <td>${temp.goldCustomer}</td>
		</c:if>
	<tr>	
	</c:forEach>
</table>
</body>
</html>