<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/11/04
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>upload to server</h1>
<form action="ex4_uploadaction.jsp" method="post"
      enctype="multipart/form-data">
    writer : <input type="text" name="writer"><br>
    subject : <input type="text" name="subject"><br>
    photo : <input type="file" name="photo"><br>
    <button type="submit">upload</button>
</form>
</body>
</html>
