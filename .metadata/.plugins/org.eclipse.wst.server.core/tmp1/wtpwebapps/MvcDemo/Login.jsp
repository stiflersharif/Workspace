<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h3>Login : <br></h3>
<form action="Login_servlet2" method="post">
Email     : <input type="text" name="user_name" value="Email">
Password  : <input type="password" name="password" value="Password">
<br>
<input type="submit" name="submit" >
</form>
</body>
</html>