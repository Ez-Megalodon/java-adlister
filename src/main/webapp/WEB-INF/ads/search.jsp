<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="/WEB-INF/partials/head.jsp">
    <jsp:param name="title" value="Search" />
  </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
  <c:if test="${empty search}">
    <h1>Here Are all the ads!</h1>
  </c:if>
  <c:if test="${not empty search}">
    <h1>You are searching for <c:out value="${search}"/></h1>
  </c:if>
  
  <form action="/ads/search" method="post">
    <input type="text" name="search" placeholder="search">
    <button type="submit">Search</button>
  </form>

<%--  <c:forEach var="ad" items="${ads}">--%>
<%--    --%>
<%--  </c:forEach>--%>
</div>

</body>
</html>
