package day0922;

import java.sql.*;

public class Ex07BuseoAnalysis {

    public Ex07BuseoAnalysis() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("driver success.");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("nothing oracle driver.");
        }
    }

    public void analysis() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String sql = "select buseo,count(buseo) count,to_char(avg(pay),'L999,999,999') avg "
                + "from sawon group by buseo order by buseo asc";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        try {
            conn = DriverManager.getConnection(url, "angel", "a1234");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println("conn success.");

            while (rs.next()) {
                String buseo = rs.getString("buseo");
                int count = rs.getInt("count");
                String avg = rs.getString("avg");

                System.out.println(String.format("%s\t%d\t%s", buseo, count, avg));
            }

            System.out.println("end");

        } catch (SQLException e) {
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
        Ex07BuseoAnalysis ex = new Ex07BuseoAnalysis();
        ex.analysis();
    }

}
