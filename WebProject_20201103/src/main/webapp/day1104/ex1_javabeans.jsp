<%@ page import="object.test.TestDto" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="dto" class="object.test.TestDto" scope="page"/>
<jsp:setProperty name="dto" property="carName" value="소나타"/>
<jsp:setProperty name="dto" property="carColor" value="red"/>
<jsp:setProperty name="dto" property="carPrice" value="4500"/>

carPrice <jsp:getProperty name="dto" property="carPrice"/><br>
carColor <jsp:getProperty name="dto" property="carColor"/><br>
carName  <jsp:getProperty name="dto" property="carName"/><br><br>

<%
    TestDto dto2 = new TestDto();
    dto2.setCarName("asdf");
    dto2.setCarColor("qwer");
    dto2.setCarPrice(4300);
//    request.setAttribute(");
%>
carPrice <%=dto2.getCarPrice()%><br>
carColor <%=dto2.getCarColor()%><br>
CarName  <%=dto2.getCarName()%><br><br>


<%--아래 했던것들을 토대로 el사용 가능 그래서 dto.get~ 이렇게 된거--%>
<%--<jsp:setProperty name="dto" property="carName" value="소나타"/>--%>
<%--<jsp:setProperty name="dto" property="carColor" value="red"/>--%>
<%--<jsp:setProperty name="dto" property="carPrice" value="4500"/>--%>
carPrice : ${dto.getCarPrice()}<br>
carColor : ${dto.getCarColor()}<br>
CarName : ${dto.getCarName()}<br>
</body>
</html>
