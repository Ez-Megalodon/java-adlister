<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>

<h1>Enter your favorite color!</h1>
<form action="${pageContext.request.contextPath}/viewcolor" method="post">
    <label for="color">Color:</label>
    <input type="text" id="color" name="color">
    <button type="submit">Submit</button>
</form>

</body>
</html>