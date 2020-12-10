<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/12/10
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table, tr, td, th {
            border: 1px solid gray;
        }
    </style>
</head>
<body>
<h2> jstl for</h2>
<c:forEach var="n" begin="1" end="10">
    ${n}&nbsp;
</c:forEach>
<br>

<c:forEach var="n" begin="0" end="30" step="5">
    ${n}&nbsp;
</c:forEach>
<br>

<%
    String[] colors = "red,green,blue,magenta,gray".split(",");
%>

<c:set var="colors" value="<%=colors%>"></c:set>
<h2> all print </h2>
<table>
    <tr>
        <th width="70">index</th>
        <th width="70">count</th>
        <th width="70">colors</th>
        <th width="70">fill</th>
    </tr>
    <c:forEach var="a" items="${colors}" varStatus="i">
        <tr>
            <td>${i.index}</td>
            <td>${i.count}</td>
            <td>${a}</td>
            <td style="background-color: ${a}"></td>
        </tr>
    </c:forEach>
</table>
<br><br>
<h2> index 0~2 </h2>
<table>
    <tr>
        <th width="70">index</th>
        <th width="70">count</th>
        <th width="70">colors</th>
        <th width="70">fill</th>
    </tr>
    <c:forEach var="a" items="${colors}" begin="0" end="2" varStatus="i">
        <tr>
            <td>${i.index}</td>
            <td>${i.count}</td>
            <td>${a}</td>
            <td style="background-color: ${a}"></td>
        </tr>
    </c:forEach>
</table>
<br><br>
<h2> index 3~4 </h2>
<table>
    <tr>
        <th width="70">index</th>
        <th width="70">count</th>
        <th width="70">colors</th>
        <th width="70">fill</th>
    </tr>
    <c:forEach var="a" items="${colors}" begin="3" end="4" varStatus="i">
        <tr>
            <td>${i.index}</td>
            <td>${i.count}</td>
            <td>${a}</td>
            <td style="background-color: ${a}"></td>
        </tr>
    </c:forEach>
</table>
<br><br>
</body>
</html>
