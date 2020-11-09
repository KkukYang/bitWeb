<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/11/04
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>output id / hp in Session</h1>
<%
    String id = (String)session.getAttribute("id");
    String hp = (String)session.getAttribute("hp");
%>
id : ${id}<br>
hp : ${hp}<br>
</body>
</html>
