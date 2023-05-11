<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Ads</title>
</head>
<body>
<h1>Ads</h1>


<c:forEach var="ad" items="${ads}">
    <h2>${ad.title}</h2>
    <h4>user id:${ad.userId}</h4>
    <h3>${ad.description}</h3>
</c:forEach>

</body>
</html>
