<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
	
	The Student is Confirmed: ${param.FirstName} ${param.LastName}
	<br>
	<!-- display list of favorite list -->
	<ul>
		<%
			String[] langs= request.getParameterValues("favoritelanguage");
			System.out.println(langs);
			for(String temp:langs){
				out.println("<li>" + temp + "</li>" );
			}
		%>
	</ul>
	<br>
	
	Student Country: ${param.Country }
	
</body>
</html>