package oracle.db;


import java.sql.*;

public class OracleConnect {

    private OracleConnect() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("driver success.");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("nothing oracle driver.");
        }
    }

    public static OracleConnect getInstance() {
        return new OracleConnect();
    }

    public Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        try {
            conn = DriverManager.getConnection(url, "angel", "a1234");
            System.out.println("conn success.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public void dbClose(Statement stmt, Connection conn) {
        try {
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

    public void dbClose(ResultSet rs, Statement stmt, Connection conn) {
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

    public void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dbClose(PreparedStatement pstmt, Connection conn) {
        try {
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
