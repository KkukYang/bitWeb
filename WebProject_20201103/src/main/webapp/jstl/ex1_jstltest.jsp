<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/12/10
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="name" value="yang"></c:set>
<c:set var="age" value="23"></c:set>
<c:set var="today" value="<%=new Date()%>"></c:set>

<h2>name : <c:out value="${name}"></c:out></h2>
<h2>age : <c:out value="${age}"></c:out></h2>
<h2>today : <c:out value="${today}"></c:out></h2>

<%--use pattern fmt date--%>
<pre>
    <fmt:formatDate value="${today}" pattern="yyyy-MM-dd HH:mm"></fmt:formatDate>
    <fmt:formatDate value="${today}" pattern="yyyy-MM-dd a hh:mm"></fmt:formatDate>
    <fmt:formatDate value="${today}" pattern="yyyy-MM-dd HH:mm EEE"></fmt:formatDate>
    <fmt:formatDate value="${today}" pattern="yyyy-MM-dd HH:mm EEEE"></fmt:formatDate>
</pre>

<c:set var="money" value="6789000"></c:set>
<c:set var="num1" value="123.456789"></c:set>

<pre>
    ${money}
    ${num1}
    <fmt:formatNumber value="${money}" type="number"></fmt:formatNumber>
    <fmt:formatNumber value="${money}" type="currency"></fmt:formatNumber>

    <fmt:formatNumber value="${num1}" type="number"></fmt:formatNumber>
    <fmt:formatNumber value="${num1}" type="currency"></fmt:formatNumber>

    <fmt:formatNumber value="${num1}" pattern="0.00"></fmt:formatNumber>
    <fmt:formatNumber value="1.2" pattern="0.00"></fmt:formatNumber>
    <fmt:formatNumber value="1.2" pattern="#.##"></fmt:formatNumber>
</pre>


</body>
</html>
