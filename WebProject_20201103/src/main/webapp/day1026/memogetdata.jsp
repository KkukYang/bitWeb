<%@ page import="ajax.memo.db.MemoDao" %>
<%@ page import="ajax.memo.db.MemoDto" %>
<%@ page import="org.json.simple.JSONObject" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/26
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String num = request.getParameter("num");
    MemoDao dao = new MemoDao();
    MemoDto dto = dao.getData(num);

    JSONObject ob = new JSONObject();
    ob.put("num", dto.getNum());
    ob.put("nickname", dto.getNickname());
    ob.put("content", dto.getContent());
    ob.put("avata", dto.getAvata());
    ob.put("likes", dto.getLikes());
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    ob.put("writeday", sdf.format(dto.getWriteday()));
    System.out.println(ob.toString());
%>

<%=ob.toString()%>


<%--
JSONObject ob = new JSONObject();
ob.put("num",num);
ob.put("writer",writer);
ob.put("photo",photo);
ob.put("subject",subject);
ob.put("content",content);
ob.put("writeday",sdf.format(writeday));
arr.add(ob);
--%>
