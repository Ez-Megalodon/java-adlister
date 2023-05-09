<%--
  Created by IntelliJ IDEA.
  User: ezramarama
  Date: 5/9/23
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <%@include file="partials/head.jsp"%>

</head>
<body>

    <%@include file="partials/navbar.jsp"%>

    <h1>Login</h1>
    <form method="post" action="login.jsp">
        <label for="username">Username:</label>
        <input type="text" name="username" id="username"><br>

        <label for="password">Password:</label>
        <input type="password" name="password" id="password"><br>
        <button type="submit">Submit</button>
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username.equals("admin") && password.equals("password")) {
                // If the credentials are correct, redirect the user to a success page
                response.sendRedirect("profile.jsp");
            } else {
                response.sendRedirect("login.jsp");
            }
        }
    %>

</body>
</html>
