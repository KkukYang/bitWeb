<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/11/04
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    boolean isLogin = false;
    String loginok = (String) session.getAttribute("loginok");
    if (loginok != null) {
        isLogin = true;
    }
%>
<body>
<%
    if (isLogin) {
%>
    <jsp:include page="sessionlogout.jsp"></jsp:include>
<%
    } else {
%>
    <jsp:include page="sessionlogin.jsp"></jsp:include>
<%
    }
%>
<hr align="left" width="500" size="10" color="orange">
<h1>today main news</h1>
<jsp:include page="paper.jsp"></jsp:include>

</body>
</html>
