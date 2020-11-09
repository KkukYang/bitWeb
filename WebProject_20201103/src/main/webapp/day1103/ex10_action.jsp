<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div.box{
		width: 80px;
		height: 80px;
		margin-right: 10px;	
		display: inline-block;	
	}
</style>
</head>
<body>
<%
	//post 방식일 경우 한글 엔코딩
	request.setCharacterEncoding("utf-8");

	//한요소로 여러개의 값을 넘겨받을경우 getParameterValues
	//선택을 안할경우 변수값은 null 이되고 있을경우 배열로 넘어온다
	String []color=request.getParameterValues("color");
	String []itlang=request.getParameterValues("itlang");
%>
 <h1>폼으로부터 전달받은 값 출력하기</h1>
 <%
 	if(color==null)
 	{%>
 		<h2>목록에는 좋아하는 색상이 없습니다</h2>
 	<%}else{
 		for(String mycolor:color)
 		{%>
 			<div class="box" style="background-color: <%=mycolor%>">
 			</div>
 		<%} 		
 	}
 %>
 <h1>현재 공부중인 IT 언어</h1>
 <%
 	if(itlang==null)
 	{%>
 		<h2>목록에는 현재 공부중인 언어가 없습니다</h2>
 	<%}else{
 		for(String it:itlang)
 		{%>
 			<h2><%=it%></h2>
 		<%}
 	}
 %>
</body>
</html>



























