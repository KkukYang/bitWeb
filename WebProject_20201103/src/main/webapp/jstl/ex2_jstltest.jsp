<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/12/10
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table, tr, th, td {
            border: 1px solid gray;
            font-size: 15px;
        }
    </style>
</head>
<body>
<c:set var="su1" value="7"></c:set>
<c:set var="su2" value="4"></c:set>
su1 = ${su1}, su2 = ${su2}
<table>
    <caption>JSTL 연산자 공부</caption>
    <tr>
        <th width="200">연산자식</th>
        <th width="200">결과</th>
    </tr>
    <tr>
        <td>\${su1 + su2}</td>
        <td>${su1 + su2}</td>
    </tr>
    <tr>
        <td>\${su1 - su2}</td>
        <td>${su1 - su2}</td>
    </tr>
    <tr>
        <td>\${su1 * su2}</td>
        <td>${su1 * su2}</td>
    </tr>
    <tr>
        <td>\${su1 / su2}</td>
        <td>${su1 / su2}</td>
    </tr>
    <tr>
        <td>\${su1 % su2}</td>
        <td>${su1 % su2}</td>
    </tr>
    <tr>
        <td>\${su1 div su2}</td>
        <td>${su1 div su2}</td>
    </tr>
    <tr>
        <td>\${su1 mod su2}</td>
        <td>${su1 mod su2}</td>
    </tr>
    <tr>
        <td>\${su1 == su2 && su1 >= 5}</td>
        <td>${su1 == su2 && su1 >= 5}</td>
    </tr>
    <tr>
        <td>\${su1 eq su2 and su1 ge 5}</td>
        <td>${su1 eq su2 and su1 ge 5}</td>
    </tr>
    <tr>
        <td>su1 +1</td>
        <td>
            <c:set var="su1" value="${su1+1}"></c:set>
            ${su1}
        </td>
    </tr>
    <tr>
        <td>su2 -1</td>
        <td>
            <c:set var="su2" value="${su2-1}"></c:set>
            ${su2}
        </td>
    </tr>
    <tr>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
    </tr>


</table>



</body>
</html>
