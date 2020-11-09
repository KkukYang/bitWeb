<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/11/04
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String passwd = request.getParameter("passwd");
    if (passwd.equals("angel")) {
        session.setAttribute("loginok", "success");
//        session.setMaxInactiveInterval(60*60*24*7);//지정 안해주면 기본 30분.
        session.setMaxInactiveInterval(60 * 60 * 24);//24시간 지정.
        response.sendRedirect("sessionmain.jsp");
    } else {
%>
        <script type="text/javascript">
            alert("암호가 맞지 않음.");
            history.back();
        </script>
<%
    }
%>