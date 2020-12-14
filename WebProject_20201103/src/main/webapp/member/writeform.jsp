<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/12/11
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table, tr, th, td {
            border: 1px solid gray;
        }
    </style>
</head>
<body>
<form action="write" method="post">
    <table>
        <caption><b>input member info</b></caption>
        <tr>
            <th>name</th>
            <td>
                <input type="text" width="100" name="name" size="10" required="required">
            </td>
        </tr>
        <tr>
            <th>hp</th>
            <td>
                <input type="text" width="100" name="hp" size="10" required="required">
            </td>
        </tr>
        <tr>
            <th>addr</th>
            <td>
                <input type="text" width="100" name="addr" size="10" required="required">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <button type="submit">save DB</button>
                <button type="button"
                        onclick="location.href='list'">
                    member list
                </button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
