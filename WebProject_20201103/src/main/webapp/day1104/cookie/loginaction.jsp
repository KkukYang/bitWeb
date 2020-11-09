<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/11/04
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String passwd = request.getParameter("passwd");
    Cookie cookie = null;
    if (passwd.equals("1234")) {
        cookie = new Cookie("loginok", "success");
        cookie.setMaxAge(10);//10초 후 제거
        cookie.setPath("/");// root / 에 저장하기
        //브라우저에 쿠키 추가
        response.addCookie(cookie);
        //메인 페이지로 이동.
        response.sendRedirect("cookiemain.jsp");
    } else {
%>
        <script type="text/javascript">
            alert("암호가 맞지 않음.");
            history.back();
        </script>
<%
    }
%>