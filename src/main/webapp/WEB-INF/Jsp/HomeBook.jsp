<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/7
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language ="java" contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>HOME-BOOK</title>
</head>
<body>
    <h1>Login in !</h1>
    <h4>Book List</h4>
    <table>
        <tr bgcolor="#fff8dc">
            <td>id</td>
            <td>BookName</td>
            <td>Author</td>
            <td>Description</td>
        </tr>
        <c:forEach items="${bookList}" var="book">
            <tr>
                <td>${book.bookId}</td>
                <td>${book.bookName}</td>
                <td>${book.author}</td>
                <td>${book.description}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>