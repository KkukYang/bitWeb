<?xml version="1.0" encoding="UTF-8"?>
<%@page import="java.text.NumberFormat" %>
<%@page import="oracle.db.OracleConnect" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/xml; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    //변수 선언
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String sql = "select * from ajaxboard";
    //자바프로젝트에서 복사해온 클래스
    OracleConnect db = OracleConnect.getInstance();
    //db 서버에 연결
    conn = db.getConnection();
%>

<list>
    <%
        try {
            pstmt = conn.prepareStatement(sql);
            //실행
            rs = pstmt.executeQuery();
            //데이타 가져오기
            while (rs.next()) {
                int num = rs.getInt("num");
                String writer = rs.getString("writer");
                String subject = rs.getString("subject");
                String content = rs.getString("content");
                String photo = rs.getString("photo");
                Timestamp writeday = rs.getTimestamp("writeday");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

//                System.out.println(num);
//                System.out.println(writer);
//                System.out.println(subject);
//                System.out.println(content);
//                System.out.println(photo);
//                System.out.println(writeday);

    %>
    <board num="<%=num%>" writer="<%=writer%>">
        <subject><%=subject%></subject>
        <content><%=content%></content>
        <photo><%=photo%></photo>
        <writeday><%=sdf.format(writeday)%></writeday>
    </board>
    <%
            }
        } catch (SQLException e) {
            System.out.println("출력 오류:" + e.getMessage());
        }
    %>
</list>
