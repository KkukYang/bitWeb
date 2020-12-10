<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/12/10
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");

    request.setAttribute("list", list);
    session.setAttribute("id", "angel");
    session.setAttribute("hp", "010-1234-1234");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> request list </h1>
<c:forEach var="s" items="${requestScope.list}" varStatus="i">
    ${i.count} : ${s}<br>
</c:forEach>

<h1> request list skip requestScope </h1>
<c:forEach var="s" items="${list}" varStatus="i">
    ${i.count} : ${s}<br>
</c:forEach>

<h1>hp id</h1>
id : ${sessionScope.id}<br>
hp : ${hp}<br>

<h1> token </h1>
<c:set var="msg" value="red,gree,blue,yellow,pink"></c:set>
<c:forTokens items="${msg}" delims="," var="s" varStatus="i">
    <h4>${i.count} : <b style="color:${s}">${s}</b></h4>
</c:forTokens>
</body>
</html>
