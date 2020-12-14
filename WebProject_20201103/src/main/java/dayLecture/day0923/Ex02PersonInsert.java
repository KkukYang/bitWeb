package dayLecture.day0923;

import oracle.db.OracleConnect;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex02PersonInsert {

    OracleConnect connect;

    public Ex02PersonInsert() {
        connect = OracleConnect.getInstance();
    }

    public void personInsert() {

        Scanner sc = new Scanner(System.in);
        String name, blood;
        int java, spring;
        double height;
        System.out.println("input name:");
        name = sc.nextLine();
        System.out.println("input blood:");
        blood = sc.nextLine();
        System.out.println("input java score:");
        java = sc.nextInt();
        System.out.println("input spring score:");
        spring = sc.nextInt();
        System.out.println("input height:");
        height = sc.nextDouble();

//	String sql = "insert into person values(seq_person.nextval, name, blood, java, spring, height, sysdate)";
        String sql = String.format("insert into person values(seq_person.nextval, '%s', '%s', %d, %d, %f, sysdate)"
                , name, blood, java, spring, height);
        System.out.println(sql);

        Connection conn = null;
        Statement stmt = null;

        conn = connect.getConnection();

        try {
            stmt = conn.createStatement();
            stmt.execute(sql);
            System.out.println("add data success.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connect.dbClose(stmt, conn);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex02PersonInsert ex = new Ex02PersonInsert();
        ex.personInsert();
    }

}
