<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>

<h1>Guess the number between 1 & 3</h1>

<form action="${pageContext.request.contextPath}/guess" method="post">
    <label for="number">Number: </label>
    <input type="text" id="number" name="number">
    <button type="submit">Submit</button>
</form>

</body>
</html>
