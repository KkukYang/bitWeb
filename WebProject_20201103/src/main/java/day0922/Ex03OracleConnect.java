package day0922;

import java.sql.*;

public class Ex03OracleConnect {

    public Ex03OracleConnect() {
        // TODO Auto-generated constructor stub
        System.out.println("Ex03OracleConnect()");

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("success.");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("nothing oracle driver.");
        }

    }

    public void countSawon() {
        Connection conn = null;
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // SID 가 뭔지에 따라 orcl/xe
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, "angel", "a1234");
            System.out.println("success");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select count(*) cnt from sawon");
            if (rs.next()) {
                int cnt = rs.getInt(1);
                System.out.println("cnt : " + cnt);
                cnt = rs.getInt("cnt");
                System.out.println("cnt : " + cnt);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex03OracleConnect ex = new Ex03OracleConnect();
        ex.countSawon();
    }

}
