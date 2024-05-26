<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Books Page</h1>
<ul>
    <c:forEach var="book" items="${books}">
        <li>${book}</li>
    </c:forEach>
</ul>