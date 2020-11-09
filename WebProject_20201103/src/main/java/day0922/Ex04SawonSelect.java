package day0922;

import java.sql.*;
import java.text.NumberFormat;
import java.util.Date;

public class Ex04SawonSelect {
    public Ex04SawonSelect() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("driver success.");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("nothing oracle driver.");
        }
    }

    public void writeSawon() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        try {
            conn = DriverManager.getConnection(url, "angel", "a1234");
            System.out.println("conn success.");
            stmt = conn.createStatement();

            rs = stmt.executeQuery("select * from sawon order by name");

            while (rs.next()) {
                String num = rs.getString(1);
                String name = rs.getString(2);
                String buseo = rs.getString(3);
                int pay = rs.getInt(4);
                int paytax = rs.getInt(5);
                Date ipsaday = rs.getDate(6);
                String jumin = rs.getString("juminno");

                NumberFormat nf = NumberFormat.getCurrencyInstance();
//		System.out.println(
//			String.format("%s\t%s\t%s\t%d\t%d\t%s\t%s", num, name, buseo, pay, paytax, ipsaday, jumin));
                System.out.println(num + "\t" + name + "\t" + buseo + "\t" + nf.format(pay) + "\t" + paytax + "\t"
                        + ipsaday + "\t" + jumin);
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
        Ex04SawonSelect ex = new Ex04SawonSelect();
        ex.writeSawon();

    }

}
