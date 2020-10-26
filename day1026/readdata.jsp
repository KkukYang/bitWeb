<%@ page import="ajax.memo.db.MemoDao" %>
<%@ page import="ajax.memo.db.MemoDto" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/26
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    //post 방식으로 보냈으므로 한글 인코딩.
    request.setCharacterEncoding("utf-8");
    String nick = request.getParameter("nick");
    String content = request.getParameter("content");
    String avata = request.getParameter("avata");

    MemoDto dto = new MemoDto();
    dto.setNickname(nick);
    dto.setContent(content);
    dto.setAvata(avata);

    MemoDao dao = new MemoDao();
    dao.memoInsert(dto);


%>