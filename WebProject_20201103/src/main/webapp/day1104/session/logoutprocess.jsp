<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/11/04
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
//    session.invalidate(); //다없앰.
    session.removeAttribute("loginok");
    response.sendRedirect("sessionmain.jsp");
%>

