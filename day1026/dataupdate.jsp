<%@ page import="ajax.memo.db.MemoDao" %>
<%@ page import="ajax.memo.db.MemoDto" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/26
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");

    String nick = request.getParameter("nick");
    String content = request.getParameter("content");
    String avata = request.getParameter("avata");
    String num = request.getParameter("num");
    String likes = request.getParameter("likes");

    MemoDto dto = new MemoDto();
    dto.setNickname(nick);
    dto.setContent(content);
    dto.setAvata(avata);
    dto.setNum(num);
    dto.setLikes(Integer.parseInt(likes));

    MemoDao dao = new MemoDao();
    dao.memoUpdate(dto);
%>