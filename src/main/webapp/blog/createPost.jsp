<%--
  Created by IntelliJ IDEA.
  User: ezramarama
  Date: 5/9/23
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Blog</title>
</head>
<body>

    <div class="container">
        <h1>Create Blog Post</h1>
        <form action="createPost" method="POST">
            <label for="post">Your Post</label>
            <textarea name="blogPost" id="post" cols="30" rows="10"></textarea>
            <input type="submit" value="submit">
        </form>
    </div>

    <c:if test="${pageContext.request.method == 'POST'}">
        <h2>Your Blog Post:</h2>
        <p>${blogPost}</p>
    </c:if>


</body>
</html>
