<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.Enumeration" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<%
    //서버에 올라간 프로젝트의 실제 경로 구하기(save)
    ServletContext context = request.getServletContext();
    String realFolder = context.getRealPath("/save");
//    String realFolder = application.getRealPath("/save");
    System.out.println(realFolder);

    //업로드할 파일의 크기
    int uploadSize = 1024 * 1024 * 2;//2mb

    MultipartRequest multi = null;
    multi = new MultipartRequest(request, realFolder, uploadSize,
            "utf-8", new DefaultFileRenamePolicy());


// String savePath = application.getRealPath("./media");
// String file = "";
// String oriFile = "";
// int sizeLimit = 5 * 1024 * 1024;
// System.out.println(savePath);
//
// MultipartRequest multi = new MultipartRequest(request, savePath, sizeLimit, "UTF-8", new DefaultFileRenamePolicy());
// Enumeration files = multi.getFileNames();
// String name = (String) files.nextElement();
//
// file = multi.getFilesystemName(name);
// oriFile = multi.getOriginalFileName(name);


    try {

        //모든 데이타는 multi 로 읽어야만 한다
        //request 로 읽을경우 못 읽어옴
        String writer = multi.getParameter("writer");
        String subject = multi.getParameter("subject");
        String uploadName = multi.getFilesystemName("photo");
        String originalName = multi.getOriginalFileName("photo");
%>
<h1>데이타 및 이미지 확인</h1>
<h2>
    작성자 : <%=writer %><br>
    제 목 : <%=subject %><br>
    원래이미지명: <%=originalName %><br>
    업로드된이미지명 : <%=uploadName %><br>
</h2>
<h1>이미지 확인하기</h1>
<img src="../save/<%=uploadName%>" style="max-width: 300px">
<%
    } catch (Exception e) {
        System.out.println("업로드 오류:" + e.getMessage());
        PrintWriter out1 = response.getWriter();
        out1.print("업로드 오류:" + e.getMessage());//브라우저에 출력
    }

%>
<body>

</body>
</html>









