<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/21
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <style type="text/css">
        td{
            border: 3px groove black;
            width: 30px;
        }
    </style>
</head>
<body>
<table >
    <tr>
        <%
            for (int i = 2; i <= 9; i++) {
        %>
        <td align="center">
        <%
                for (int j = 1; j <= 9; j++) {
        %>
                    <%=i%>*<%=j%>=<%=i * j%><br>

        <%
                }
        %>
        </td>
        <%
            }
        %>
    </tr>
</table>
</body>
</html>
