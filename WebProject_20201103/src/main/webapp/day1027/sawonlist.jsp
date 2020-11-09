<%@ page import="ajax.sawon.db.SawonDao" %>
<%@ page import="ajax.sawon.db.SawonDto" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/27
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/xml;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");
    SawonDao dao = new SawonDao();
    List<SawonDto> list = dao.getSawonList();
%>
<list>
    <%
        for (SawonDto dto : list) {
    %>
    <sawon num="<%=dto.getNum()%>">
        <name><%=dto.getName()%></name>
        <driver><%=dto.getDriver()%></driver>
        <gender><%=dto.getGender()%></gender>
        <address><%=dto.getAddress()%></address>
        <birthday><%=dto.getBirthday()%></birthday>
    </sawon>
    <%
        }
    %>
</list>



