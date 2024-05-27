<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Books Page</title>
</head>
<body>
<h1>Books Page</h1>
<ul>
    <c:forEach var="book" items="${books}">
        <li>${book.title} by ${book.author}</li>
    </c:forEach>
</ul>
<a href="newBook.html">Add a New Book</a>
</body>
</html>