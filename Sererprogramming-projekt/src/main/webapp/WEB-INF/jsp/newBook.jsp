<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h2>Add a New Book</h2>
<form:form modelAttribute="form" action="newBook.html" method="post">
    <table>
        <tr>
            <td>Title:</td>
            <td><form:input path="title"/></td>
        </tr>
        <tr>
            <td>Author:</td>
            <td><form:input path="author"/></td>
        </tr>
        <tr>
            <td>ISBN:</td>
            <td><form:input path="isbn"/></td>
        </tr>
        <tr>
            <td>Pages:</td>
            <td><form:input path="pages"/></td>
        </tr>
        <tr>
            <td>Status:</td>
            <td><form:input path="status"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Add Book"/></td>
        </tr>
    </table>
</form:form>
