<%@ page import="ajax.memo.db.MemoDao" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/27
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/xml;charset=UTF-8" language="java" %>
<%
    String num = request.getParameter("num");
//    num = "18";
    MemoDao dao = new MemoDao();
    dao.memoUpdateLikes(num);
    int likes = dao.getData(num).getLikes();
%>

<likes><%=likes%></likes>