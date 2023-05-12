<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Color</title>
    <style>
        body {
            <c:if test="${color != null}">
                background-color: ${color};
            </c:if>
        }
    </style>
</head>
<body>
<h1>your color.</h1>

</body>
</html>
