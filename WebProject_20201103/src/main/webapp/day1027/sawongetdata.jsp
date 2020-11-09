<%@ page import="ajax.sawon.db.SawonDao" %>
<%@ page import="ajax.sawon.db.SawonDto" %>
<%@ page import="org.json.simple.JSONObject" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/28
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String num = request.getParameter("num");
//    num = "43";
    SawonDao dao = new SawonDao();
    SawonDto dto = dao.getData(num);

    JSONObject ob = new JSONObject();
    ob.put("num", dto.getNum());
    ob.put("name", dto.getName());
    ob.put("driver", dto.getDriver());
    ob.put("gender", dto.getGender());
    ob.put("address", dto.getAddress());
    ob.put("birthday", dto.getBirthday());
%>

<%=ob.toString()%>