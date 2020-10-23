<%@ page import="oracle.db.OracleConnect" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.sql.*" %>
<%@ page import="org.json.simple.JSONArray" %>
<%@ page import="org.json.simple.JSONObject" %><%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/10/23
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String sql = "select * from ajaxboard order by num asc";
    OracleConnect db = OracleConnect.getInstance();
    conn = db.getConnection();
    JSONArray arr = new JSONArray();

    try{

        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();

        while (rs.next()){
            int num = rs.getInt("num");
            String writer = rs.getString("writer");
            String subject = rs.getString("subject");
            String content = rs.getString("content");
            String photo = rs.getString("photo");
            Timestamp writeday = rs.getTimestamp("writeday");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

            JSONObject ob = new JSONObject();
            ob.put("num",num);
            ob.put("writer",writer);
            ob.put("photo",photo);
            ob.put("subject",subject);
            ob.put("content",content);
            ob.put("writeday",sdf.format(writeday));
            arr.add(ob);
        }

    }catch(SQLException e){
        e.printStackTrace();
    }finally {
        db.dbClose(rs, pstmt, conn);
    }
%>
<%=arr.toString()%>

<%--
[
  {
    "subject": "hello1",
    "num": 7,
    "photo": "c1.png",
    "writer": "candy",
    "writeday": "2020-10-22 07:30",
    "content": "ajax study1"
  },
  {
    "subject": "hello2",
    "num": 8,
    "photo": "c2.png",
    "writer": "candy1",
    "writeday": "2020-10-22 07:30",
    "content": "ajax study2"
  },
  {
    "subject": "hello3",
    "num": 9,
    "photo": "c3.png",
    "writer": "candy2",
    "writeday": "2020-10-22 07:30",
    "content": "ajax study3"
  },
  {
    "subject": "hello4",
    "num": 10,
    "photo": "c4.png",
    "writer": "candy3",
    "writeday": "2020-10-22 07:30",
    "content": "ajax study4"
  },
  {
    "subject": "hello5",
    "num": 11,
    "photo": "c5.png",
    "writer": "candy4",
    "writeday": "2020-10-22 07:30",
    "content": "ajax study5"
  },
  {
    "subject": "hello6",
    "num": 12,
    "photo": "c6.png",
    "writer": "candy5",
    "writeday": "2020-10-22 07:30",
    "content": "ajax study6"
  },
  {
    "subject": "hello7",
    "num": 13,
    "photo": "c7.png",
    "writer": "candy6",
    "writeday": "2020-10-22 07:30",
    "content": "ajax study7"
  },
  {
    "subject": "hello8",
    "num": 14,
    "photo": "c8.png",
    "writer": "candy7",
    "writeday": "2020-10-22 07:30",
    "content": "ajax study8"
  },
  {
    "subject": "hello8",
    "num": 15,
    "photo": "1.JPG",
    "writer": "candy71",
    "writeday": "2020-10-22 07:32",
    "content": "ajax study8"
  },
  {
    "subject": "hello8",
    "num": 16,
    "photo": "2.JPG",
    "writer": "candy72",
    "writeday": "2020-10-22 07:32",
    "content": "ajax study8"
  },
  {
    "subject": "hello8",
    "num": 17,
    "photo": "3.JPG",
    "writer": "candy73",
    "writeday": "2020-10-22 07:32",
    "content": "ajax study8"
  }
]
  --%>
