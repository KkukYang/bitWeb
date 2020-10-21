<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%
    //    request.setCharacterEncoding("UTF-8");//get 방식일땐 필요없음
    //get 방식
    //폼에서 보낸 데이터 읽기
    String name = request.getParameter("name");
//    name = new String(name.getBytes("8859_1"), "UTF-8");  //톰캣 7에서 한글 깨질때. ->톰캣9로 바꿈.
    String gender = request.getParameter("gender");
//    gender = new String(gender.getBytes("8859_1"), "UTF-8");  //톰캣 7에서 한글 깨질때.


%>
<h2>서버에서 보낸 데이터 읽기 get</h2>
<h3>이름 : <%=name%>
</h3>
<h3>성별 : <%=gender%>
</h3>
</body>
</html>
