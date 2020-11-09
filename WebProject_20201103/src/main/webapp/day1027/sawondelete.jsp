<%@ page import="ajax.sawon.db.SawonDao" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/28
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String num = request.getParameter("num");
    SawonDao dao = new SawonDao();
    dao.deleteSawon(num);
%>