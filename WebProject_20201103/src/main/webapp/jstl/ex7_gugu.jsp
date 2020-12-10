<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/12/10
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table, tr, td, th {
            border: 1px solid gray;
        }
    </style>
</head>
<body>

<table>
    <caption><b>gugu</b></caption>
    <tr bgcolor="pink">
        <c:forEach var="dan" begin="2" end="9">
            <th width="100">${dan}단</th>
        </c:forEach>
    </tr>
    <c:forEach var="i" begin="1" end="9">
        <tr>
            <c:forEach var="dan" begin="2" end="9">
                <td align="center">
                    ${dan}x${i}=${dan*i}
                </td>
            </c:forEach>
        </tr>
    </c:forEach>

</table>



</body>
</html>
