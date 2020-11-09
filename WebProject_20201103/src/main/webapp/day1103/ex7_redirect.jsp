<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ex7 번인데 이 글자가 보일까요?</h1>
<%	
	//request 의 데이타를 못가져온다는 확인을 위해서저장
	request.setAttribute("message", "화이팅");
	
	//ex8번 파일로 이동
	//redirect 의 경우 값을 넘기려면 get 방식으로 넘겨야 한다
	response.sendRedirect("ex8_redirect.jsp?sangpum=apple&price=2300");
%>
</body>
</html>












