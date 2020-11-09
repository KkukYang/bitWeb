<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/11/04
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Cookie[] cookies = request.getCookies();
    boolean isLogin = false;
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            String cookieName = cookie.getName();
            if(cookieName.equals("loginok")){
                cookie.setMaxAge(0);
                cookie.setPath("/");
                response.addCookie(cookie);
            }
        }
    }
    response.sendRedirect("cookiemain.jsp");
%>