package dayLecture.day0922;

import java.sql.*;
import java.util.Scanner;

public class Ex05SawonBuseoSearch {

    public Ex05SawonBuseoSearch() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("driver success.");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("nothing oracle driver.");
        }
    }

    public void buseoSelect() {

        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("부서명 입력 : ");
        String buseo = sc.nextLine();
        String sql = "select name, to_char(pay,'L999,999,999') pay, to_char(paytax,'L999,999,999')paytax " +
                "from sawon where buseo = '" + buseo + "'";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        try {


            conn = DriverManager.getConnection(url, "angel", "a1234");
            System.out.println("conn success.");
            stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String name = rs.getString("name");
                String pay = rs.getString("pay");
                String paytax = rs.getString("paytax");

                count++;
                System.out.println(name + "\t" + pay + "\t" + paytax);
            }
            if (count == 0) {
                System.out.println(buseo + " 에는 인원이 없음.");
            } else {
                System.out.println("총 " + count + "명");
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
        Ex05SawonBuseoSearch ex = new Ex05SawonBuseoSearch();
        ex.buseoSelect();
    }

}
