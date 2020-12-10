<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/12/10
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>jstl string function</h1>
<c:set var="msg1" value="   Have a Nice Day!!   "></c:set>
<h3>msg1 string length</h3>
msg1 : [${msg1}]<br>
length : [${fn:length(msg1)}]<br>

<h3>msg1 에서 양쪽의 공백 제거후 출력과 길이 구하기.</h3>
<c:set var="msg2" value="${fn:trim(msg1)}"></c:set>
msg2 : [${msg2}]<br>
length : ${fn:length(msg2)}<br>

<h3>msg2 를 대문자와 소문자로 변경 후 출력.</h3>
${fn:toUpperCase(msg2)}<br>
${fn:toLowerCase(msg2)}<br>

<h3>특정 문자열로 시작할 경우 true</h3>
${fn:startsWith(msg2, "Have")}<br>
${fn:startsWith(msg2, "Nice")}<br>

<h3>특정 문자열로 끝날경우 true</h3>
${fn:endsWith(msg2, "!!")}<br>
${fn:endsWith(msg2, "@@")}<br>

<h3>contains : 특정 문자열을 포함하고 있으면 true</h3>
${fn:contains(msg2, "Day")}<br>
${fn:contains(msg2, "Happy")}<br>

<h3>replace : 문자열 A를 B로 교체</h3>
${fn:replace(msg2, "a", "*")}<br>

<h3>substring : 문자열 추출 (7~10) </h3>
${fn:substring(msg2, 7, 11)}<br>




</body>
</html>
