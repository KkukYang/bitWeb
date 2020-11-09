<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
    String msg = request.getParameter("msg");
	String msg2 = (String)request.getAttribute("msg2");
	String msg3 = request.getParameter("msg2");//null
%>
<body>
<h2>여기는 ex4 번 파일입니다</h2>
<img src="../image2/an08.gif">
<h2>msg <%=msg%></h2>
<h2>msg2 <%=msg2%></h2>
<h2>msg3 <%=msg3%></h2>
</body>
</html>







