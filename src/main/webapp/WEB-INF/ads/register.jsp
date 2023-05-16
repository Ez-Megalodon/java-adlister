<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="/WEB-INF/partials/head.jsp">
    <jsp:param name="title" value="Register" />
  </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

  <div class="container">
    <form method="post" action="/register">
      <label for="username">Username:</label>
      <input type="text" name="username" id="username">
      <label for="password">Password:</label>
      <input type="password" name="password" id="password">
      <label for="email">Email:</label>
      <input type="text" name="email" id="email">
      <button type="submit">Register</button>
    </form>
  </div>

</body>
</html>
