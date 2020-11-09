<%@ page import="ajax.memo.db.MemoDao" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/26
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String num = request.getParameter("num");
    MemoDao dao = new MemoDao();
    dao.memoDelete(num);
%>