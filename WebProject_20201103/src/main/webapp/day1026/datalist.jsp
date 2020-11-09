<%@ page import="ajax.memo.db.MemoDao" %>
<%@ page import="ajax.memo.db.MemoDto" %>
<%@ page import="java.util.Vector" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/26
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/xml;charset=UTF-8" language="java" %>
<%
    MemoDao dao = new MemoDao();
    Vector<MemoDto> list = dao.getAllDatas();
%>
<list>
    <%
        for (MemoDto dto : list) {
            System.out.println("dto : " + dto);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    %>

    <board num="<%=dto.getNum()%>" likes="<%=dto.getLikes()%>">
        <nickname><%=dto.getNickname()%></nickname>
        <content><%=dto.getContent()%></content>
        <avata><%=dto.getAvata()%></avata>
        <writeday><%=sdf.format(dto.getWriteday())%></writeday>
    </board>

    <%
        }
    %>
</list>
<%--

<list>
    <board num="1" likes="0">
        <nickname></nickname>
        <content></content>
        <avata></avata>
        <writeday></writeday>
    </board>
</list>

--%>
