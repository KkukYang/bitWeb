package day0922;

import java.sql.*;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex06SawonNameSearch {

    public Ex06SawonNameSearch() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("driver success.");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("nothing oracle driver.");
        }
    }

    public void nameSearch() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input Name : ");
        String inputName = sc.nextLine();
        String sql = "select name,pay,paytax,ipsaday from sawon where name like '%" + inputName + "%'";

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
                count++;
                String name = rs.getString("name");
                int pay = rs.getInt("pay");
                int paytax = rs.getInt("paytax");
                Date ipsaday = rs.getDate("ipsaday");

                NumberFormat nf = NumberFormat.getCurrencyInstance();

                System.out.println(name + "\t" + nf.format(pay) + "\t" + nf.format(paytax) + "\t" + ipsaday);
            }

            if (count == 0) {
                System.out.println(String.format("%s라는 사람 없음.", inputName));
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
        Ex06SawonNameSearch ex = new Ex06SawonNameSearch();
        ex.nameSearch();
    }

}
