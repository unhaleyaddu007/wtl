<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<%
	String un=request.getParameter("username");
	String pw=request.getParameter("password");
	session.setAttribute("username", un);
	session.setAttribute("password", pw);
%>
<h2>Login successful!
Welcome <%=session.getAttribute("username") %>!!!</h2>
<a href="logout.jsp">Logout</a>
</body>
</html>