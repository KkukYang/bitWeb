<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/12/11
  Time: 10:03
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
        <caption><b>input car infomation.</b></caption>
        <tr>
            <th bgcolor="pink" width="100">carname</th>
            <td width="200">
                <input type="text" name="carname" size="10" required="required">
            </td>
        </tr>
        <tr>
            <th bgcolor="pink" width="100">carprice</th>
            <td width="200">
                <input type="text" name="carprice" size="10" required="required">
            </td>
        </tr>
        <tr>
            <th bgcolor="pink" width="100">carcolor</th>
            <td width="200">
                <input type="color" name="carcolor" size="10" required="required" value="white">
            </td>
        </tr>
        <tr>
            <th bgcolor="pink" width="100">carguip</th>
            <td width="200">
                <input type="date" name="carguip" size="10" required="required">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <button type="submit">DB저장</button>
                <button type="button" onclick="location.href='list'">list</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
