<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<%
    Cookie[] cookies = request.getCookies();
    boolean isLogin = false;
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            String cookieName = cookie.getName();
            String cookieValue = cookie.getValue();
            System.out.println(cookieName + "," + cookieValue);
            if (cookieName.equals("loginok")
                    && cookieValue != null
                    && cookieValue.equals("success")) {
                isLogin = true;
            }
        }
    }
%>
<body>
<%
    if (isLogin) {
%>
<jsp:include page="cookielogout.jsp"></jsp:include>
<%
} else {
%>
<jsp:include page="cookielogin.jsp"></jsp:include>
<%
    }
%>
<hr align="left" width="500" size="5" color="gray">
<h1>오늘의 주요기사</h1>
<jsp:include page="paper.jsp"></jsp:include>
</body>
</html>