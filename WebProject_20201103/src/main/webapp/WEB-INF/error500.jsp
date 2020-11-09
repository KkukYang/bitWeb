<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/11/03
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
isErrorPage="true" %>
<%--<%@ page isErrorPage="true"%>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>server error 500</h1>
<h1>error : <%=exception.getClass().getName()%></h1>
<h2 style="color: red;">error message : <%=exception.getMessage()%></h2>
</body>
</html>
