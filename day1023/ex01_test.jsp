<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/23
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/xml;charset=UTF-8" language="java" %>

<%

    //프론트쪽에서 보낸 데이터를 읽는다.
    String name = request.getParameter("name");
    String hp = request.getParameter("hp");
    String s = name+"님의 핸드폰은 "+hp;

    //데이터를 읽어서 서버로 xml형태로 문자열을 보낸다.

%>

<result>
        <%=s%>
</result>
