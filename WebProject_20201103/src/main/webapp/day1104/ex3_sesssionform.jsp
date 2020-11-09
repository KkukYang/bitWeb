<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/11/04
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>save value in session</h1>
<form action="../savesession" method="post">
    id : <input type="text" name="id"><br>
    hp : <input type="text" name="hp"><br>
    <button type="submit">서블릿에서 세션에 저장하기.</button>
</form>
</body>
</html>
