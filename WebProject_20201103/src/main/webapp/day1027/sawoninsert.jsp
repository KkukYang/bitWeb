<%@ page import="ajax.sawon.db.SawonDao" %>
<%@ page import="ajax.sawon.db.SawonDto" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/27
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String address = request.getParameter("address");
    String driver = request.getParameter("driver");
    String gender = request.getParameter("gender");
    String birthday = request.getParameter("birthday");

    SawonDto dto = new SawonDto();
    dto.setName(name);
    dto.setAddress(address);
    dto.setDriver(driver);
    dto.setGender(gender);
    dto.setBirthday(birthday);

    SawonDao dao = new SawonDao();
    dao.insertSawon(dto);

%>