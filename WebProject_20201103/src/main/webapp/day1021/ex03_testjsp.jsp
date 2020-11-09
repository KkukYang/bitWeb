<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/21
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    String[] colors = "red,green,blue,orange,pink".split(",");

%>
<body>
<table border="1">
    <tr>
        <th width="100">번호</th>
        <th width="100">색상</th>
    </tr>
    <%
        for (int i = 0; i < colors.length; i++) {%>
    <tr>
        <td align="center"><%=i + 1%>
        </td>
        <td align="center" bgcolor="<%=colors[i]%>"><%=colors[i]%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
