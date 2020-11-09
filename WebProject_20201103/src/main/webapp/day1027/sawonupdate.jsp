<%@ page import="ajax.sawon.db.SawonDto" %>
<%@ page import="ajax.sawon.db.SawonDao" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/28
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");
    String num = request.getParameter("num");
    String name = request.getParameter("name");
    String driver = request.getParameter("driver");
    String gender = request.getParameter("gender");
    String address = request.getParameter("address");
    String birthday = request.getParameter("birthday");

    SawonDto dto = new SawonDto();
    dto.setNum(num);
    dto.setName(name);
    dto.setDriver(driver);
    dto.setGender(gender);
    dto.setAddress(address);
    dto.setBirthday(birthday);

    SawonDao dao = new SawonDao();
    dao.updateSawon(dto);
%>