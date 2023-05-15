<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="album" items="${albums}">
    <div class="author">
        <h2>${album.albumName}</h2>
        <h4>${album.artist}</h4>
        <p>${album.genre}</p>
    </div>
</c:forEach>

</body>
</html>
