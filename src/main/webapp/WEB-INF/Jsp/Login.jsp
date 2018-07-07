<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/6
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SpringMVC Login</title>
</head>
<br>
<h1>SpringMVC Demo </h1>
<h2> ${sorry}</h2>
<form action="Checked" method="post">
    userName: <input type="text" name="userName"/><br />
    password : <input type="text" name="password"/><br />
    <button type="submit" value="login">Login</button>
    <button type="reset" value="Reset">Reset</button>
</form>
</body>
</html>
