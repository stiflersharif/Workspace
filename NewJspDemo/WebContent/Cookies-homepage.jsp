<%@ page import="java.net.URLDecoder" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
</head>
<body>
<h3>Training Portal</h3>

<%
	String favLang ="java";
	Cookie[] cookie=request.getCookies();
	
	if(cookie!=null){
		for(Cookie temp:cookie){
			if("myfavoriteLanguage".equals(temp.getName())){
				favLang = URLDecoder.decode(temp.getValue(),"UTF-8");
				break;
			}
		}
	}
%>

<h4> New books for <%= favLang %></h4>
<ul>
<li>blah blah blah</li>
<li>blah blah blah</li>
<li>blah blah blah</li>
</ul>

<h4> Latest News Report for <%= favLang %></h4>
<ul>
<li>blah blah blah</li>
<li>blah blah blah</li>
<li>blah blah blah</li>
</ul>

<h4> Openings for <%= favLang %></h4>
<ul>
<li>blah blah blah</li>
<li>blah blah blah</li>
<li>blah blah blah</li>
</ul>


<a href="Cokkies-personalize.html"> Personalize your page.</a>
</body>
</html>