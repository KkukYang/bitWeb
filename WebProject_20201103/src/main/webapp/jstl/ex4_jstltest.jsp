<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/12/10
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fmt:requestEncoding value="utf-8"></fmt:requestEncoding>
<form action="ex4_jstltest.jsp" method="post">
    name : <input type="text" name="name"><br>
    age : <input type="text" name="age"><br>
    <h2>choose</h2>
    <select name="nara">
        <option value="a">a</option>
        <option value="s">s</option>
        <option value="d">d</option>
        <option value="f">f</option>
    </select>
    <button type="submit">submit</button>
</form>

<c:if test="${!empty param.name}">
    <h1>입력한 값들 읽기</h1>
    <h2>
        name : ${param.name}<br>
        age : ${param.age}<br>
        nara : ${param.nara}<br>
    </h2>

    <h2>
        <c:choose>
            <c:when test="${param.nara=='a'}">
                <b style="color: maroon;">aaaaaa</b>
            </c:when>
            <c:when test="${param.nara=='s'}">
                <b style="color: green;">sssssssssss</b>
            </c:when>
            <c:when test="${param.nara=='d'}">
                <b style="color: red;">dddddd</b>
            </c:when>
            <c:otherwise>
                <b style="color: gray;">fffff</b>
            </c:otherwise>
        </c:choose>
    </h2>

    <h2>
        <c:set var="age" value="${param.age}"></c:set>
        <c:choose>
            <c:when test="${age >= 10 && age < 20}">
                <b style="color: red">
                        ${age}
                </b>
            </c:when>
            <c:when test="${age >= 20 && age < 30}">
                <b style="color: blue">
                        ${age}
                </b>
            </c:when>
            <c:when test="${age >= 30 && age < 40}">
                <b style="color: blueviolet">
                        ${age}
                </b>
            </c:when>
            <c:otherwise>
                <b style="color: cadetblue">
                        ${age}
                </b>
            </c:otherwise>
        </c:choose>
    </h2>

</c:if>


</body>
</html>
