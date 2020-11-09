<%@ page import="oracle.db.OracleConnect" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/21
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%
    //변수 선언
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String sql = "select * from person order by name asc";
    //자바프로젝트에서 복사해온 클래스
    OracleConnect db = OracleConnect.getInstance();
    //db 서버에 연결
    conn = db.getConnection();

    StringBuffer sb = new StringBuffer();
    sb.append("{\"person\":[");
    try {
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            String name = rs.getString("name");
            String blood = rs.getString("blood");
            int java = rs.getInt("java");
            int spring = rs.getInt("spring");
            double height = rs.getDouble("height");
            String birth = rs.getDate("birthday").toString();

            sb.append("{\"name\":\"" + name + "\",");
            sb.append("\"blood\":\"" + blood + "\",");
            sb.append("\"java\":" + java + ",");
            sb.append("\"spring\":" + spring + ",");
            sb.append("\"height\":" + height + ",");
            sb.append("\"birth\":\"" + birth + "\"},");
        }

//        sb.replace(sb.length() - 1, sb.length(), "");
        sb.deleteCharAt(sb.lastIndexOf(","));
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    sb.append("]}");
%>

<%=sb.toString()%>


