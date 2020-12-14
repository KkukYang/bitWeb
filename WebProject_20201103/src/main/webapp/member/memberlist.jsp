<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/12/11
  Time: 15:14
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
memberlist<br>
totalcount:${totalcount}<br>
list:${list}<br>
<button type="button" style="width: 100px;" onclick="location.href='writeform'">
    input member info
</button>

<c:if test="${totalcount>0}">
    <table>
        <tr>
            <th>num</th>
            <th>name</th>
            <th>hp</th>
            <th>addr</th>
            <th>gaipday</th>
            <th>edit</th>
        </tr>
        <c:forEach var="member" items="${list}" varStatus="i">
            <tr>
                <td>${member.num}</td>
                <td>${member.name}</td>
                <td>${member.hp}</td>
                <td>${member.addr}</td>
                <td>${member.gaipday}</td>
                <td>
                    <button type="button"
                            onclick="location.href='updateform?num=${dto.num}'">
                        modify</button>
                    <button type="button"
                            onclick="location.href='delete?num=${dto.num}'">delete</button>
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
