<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/11/04
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="dto" class="object.test.InfoDto"></jsp:useBean>
<%--멤버와 이름이 같은 데이터 자동으로 넣어주기--%>
<jsp:setProperty name="dto" property="*"></jsp:setProperty>
name    : <%=dto.getName()%><br>
hp      : <%=dto.getHp1()%>-<%=dto.getHp2()%>-<%=dto.getHp3()%><br>
email   : <%=dto.getEmail1()%>@<%=dto.getEmail2()%><br>
gender  : <%=dto.getGender()%><br>
</body>
</html>
