<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<jsp:include page="my-header.html"></jsp:include>
<h3> Server objects</h3>
Request user agent: <%=request.getHeader("User-Agent") %>
<br>
Request Language: <%= request.getLocale()%>
<br><br><br>

<jsp:include page="My-footer.jsp"></jsp:include>
</body>
</html>