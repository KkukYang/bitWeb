<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/12/10
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${totalCount == 0}">
    <h2>저장된 차의 정보가 없습니다.</h2>
</c:if>
<c:if test="${totalCount > 0}">
    <h2>총 ${totalCount} 개의 차량정보가 있습니다.</h2>
</c:if>
</body>
</html>
