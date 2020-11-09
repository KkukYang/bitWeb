<?xml version="1.0" encoding="UTF-8"?>
<%@page import="java.text.NumberFormat" %>
<%@page import="java.sql.SQLException" %>
<%@page import="oracle.db.OracleConnect" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/xml; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    //변수 선언
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String sql = "select * from sawon order by name asc";
    //자바프로젝트에서 복사해온 클래스
    OracleConnect db = OracleConnect.getInstance();
    //db 서버에 연결
    conn = db.getConnection();
%>

<sawon>
    <%
        try {
            pstmt = conn.prepareStatement(sql);
            //실행
            rs = pstmt.executeQuery();
            //데이타 가져오기
            while (rs.next()) {
                String name = rs.getString("name");
                String buseo = rs.getString("buseo");
                int pay = rs.getInt("pay");
                int paytax = rs.getInt("paytax");
                //컴마와 화폐단위 붙여서 문자열 형태로 만들기
                NumberFormat nf = NumberFormat.getCurrencyInstance();
                String spay = nf.format(pay);
                String stax = nf.format(paytax);
    %>
    <item>
        <name><%=name%></name>
        <buseo><%=buseo%></buseo>
        <pay><%=spay%></pay>
        <tax><%=stax%></tax>
    </item>
    <%
            }
        } catch (SQLException e) {
            System.out.println("출력 오류:" + e.getMessage());
        }
    %>
</sawon>
