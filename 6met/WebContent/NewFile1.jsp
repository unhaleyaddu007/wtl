<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
		 response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		//response.setHeader("Expires", "0");
		String user = request.getParameter("user");
		if(user == null)
			response.sendRedirect("index.html");
		session.setAttribute("user", user);
	%>

welcome <h1><%=session.getAttribute("user") %></h1>


<form action="index.html">
<input type="submit" value="logout">

</form>
</body>
</html>