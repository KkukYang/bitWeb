package day0922;

import java.sql.*;
import java.util.Date;

public class Ex08SelectPerson {

    public Ex08SelectPerson() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("driver success.");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("nothing oracle driver.");
        }
    }

    public void _print() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String sql = "select num, name, blood||'형' blood, height, birthday, java, spring, java+spring sum, (java+spring)/2 avg " +
                "from person";
        String sql2 = "select to_char(round(avg(java),1),'999,999.9') avgJava, to_char(round(avg(spring),1),'999,999.9') avgSpring from person";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        String avgJava = "", avgSpring = "";

        try {
            conn = DriverManager.getConnection(url, "angel", "a1234");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println("conn success.");

            while (rs.next()) {
                int num = rs.getInt("num");
                String name = rs.getString("name");
                String blood = rs.getString("blood");
                double height = rs.getDouble("height");
                Date birthday = rs.getDate("birthday");
                int java = rs.getInt("java");
                int spring = rs.getInt("spring");
                int sum = rs.getInt("sum");
                double avg = rs.getDouble("avg");

                System.out.println(String.format("%d\t%s\t%s\t%f\t%s\t%d\t%d\t%d\t%f"
                        , num, name, blood, height, birthday, java, spring, sum, avg));
            }

            System.out.println();

            rs = stmt.executeQuery(sql2);
            rs.next();
            avgJava = rs.getString("avgJava");
            avgSpring = rs.getString("avgSpring");
            System.out.println("자바점수 전체 평균 : " + avgJava.trim());
            System.out.println("스프링점수 전체 평균 : " + avgSpring.trim());


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
        Ex08SelectPerson ex = new Ex08SelectPerson();
        ex._print();
    }

}
