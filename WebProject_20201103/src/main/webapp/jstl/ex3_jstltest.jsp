<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/12/10
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="name" value="asdf"></c:set>
<c:set var="age" value="25"></c:set>
<c:if test="${age>=20}">
    <b style="color: blue;">
        ${name} 님은 성인입니다.
    </b>
</c:if>
<c:if test="${age<20}">
    <b style="color: red;">
            ${name} 님은 미성년자.
    </b>
</c:if>
</body>
</html>
