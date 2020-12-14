package dayLecture.day0923;

import oracle.db.OracleConnect;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex01StuInsert {

    OracleConnect connect;

    public Ex01StuInsert() {
        connect = OracleConnect.getInstance();
    }

    public void dataInsert() {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        String sql;
        System.out.println("input name:");
        name = sc.nextLine();
        System.out.println("input age:");
        age = sc.nextInt();
        sql = "insert into stu values (seq1.nextval,'" + name + "'," + age + ")";
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
        Ex01StuInsert ex = new Ex01StuInsert();
        ex.dataInsert();
    }

}
