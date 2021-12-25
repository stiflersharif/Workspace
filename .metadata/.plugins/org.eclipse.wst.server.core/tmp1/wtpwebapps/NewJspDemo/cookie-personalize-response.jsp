<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.net.URLEncoder" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<%
	String favLang = URLEncoder.encode(request.getParameter("favoriteLanguage"),"UTF-8");
	Cookie thecookie = new Cookie("myfavoriteLanguage", favLang);
	thecookie.setMaxAge(60*60*24*365);
	response.addCookie(thecookie);
%>
<body>
Thanks! we set your favorite language to: ${param.favoriteLanguage}
<!--Read Cookies using JSTL-->
<br><br>
	<c:forEach items="${cookie}" var="temp" >
		${temp.key} <br> ${temp.value}	<br> ${temp.value.name}	<br>${temp.value.value}	<br>
	</c:forEach>
	
<a href="Cookies-homepage.jsp"> Return to homepage.</a>

</body>
</html>