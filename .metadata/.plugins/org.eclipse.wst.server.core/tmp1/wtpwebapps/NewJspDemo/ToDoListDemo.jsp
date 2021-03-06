<%@ page import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>To Do List</title>
</head>
<body>
<form action="ToDoListDemo.jsp">
	Add new To do list: <input type ="text" name = "theItem"/>
	<br>
	<input type="submit" name="submit"/>
</form>


<%
List<String> items = (List<String>) session.getAttribute("myToDoList");  // here session.getAttrivute will return null value
if(items==null){
	System.out.println("Yes"); // during page load the session is created with myToDoList as null
}
if(items==null){//checks if value is null
	items = new ArrayList<String>();//create new reference of ArrayList
	session.setAttribute("myToDoList", items);
}

String theItem = request.getParameter("theItem");
System.out.println(theItem);
boolean isItemNotEmpty = theItem != null && theItem.trim().length() > 0;
boolean isItemNotDuplicate = theItem != null && !items.contains(theItem.trim());

if (isItemNotEmpty && isItemNotDuplicate) {    		
	items.add(theItem.trim());    		
}
%>
<hr>
<br>To List items: <br>

<ol>
<%
for(String temp:items){
	//if((!temp.equals("")) && (!temp.trim().equals(""))){
	out.println("<li>"+temp+"</li>");
	//}
}
%>
</ol>
</body>
</html>