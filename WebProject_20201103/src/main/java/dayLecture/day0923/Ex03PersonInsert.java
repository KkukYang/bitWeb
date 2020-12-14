package dayLecture.day0923;

import oracle.db.OracleConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03PersonInsert {

    OracleConnect connect;

    public Ex03PersonInsert() {
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
        String sql = String.format("insert into person values(seq_person.nextval, ?, ?, ?, ?, ?, sysdate)"
                , name, blood, java, spring, height);
        System.out.println(sql);

        Connection conn = null;
//	Statement stmt = null;
        PreparedStatement pstmt = null;

        conn = connect.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, blood);
            pstmt.setInt(3, java);
            pstmt.setInt(4, spring);
            pstmt.setDouble(5, height);

            pstmt.execute();
            System.out.println("add data success.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connect.dbClose(pstmt, conn);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex03PersonInsert ex = new Ex03PersonInsert();
        ex.personInsert();
    }
}
