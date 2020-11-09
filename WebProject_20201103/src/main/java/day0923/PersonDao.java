package day0923;

import oracle.db.OracleConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonDao {
    OracleConnect db;

    public PersonDao() {
        db = OracleConnect.getInstance();
    }

    // select all.
    public List<PersonDto> getAllPersons() {
        List<PersonDto> list = new ArrayList<PersonDto>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from person order by num asc";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                PersonDto dto = new PersonDto();
                int num = rs.getInt("num");
                int java = rs.getInt("java");
                int spring = rs.getInt("spring");
                String name = rs.getString("name");
                String blood = rs.getString("blood");
                double height = rs.getDouble("height");
                Date birthday = rs.getDate("birthday");

                dto.setNum(num);
                dto.setJava(java);
                dto.setSpring(spring);
                dto.setName(name);
                dto.setBlood(blood);
                dto.setHeight(height);
                dto.setBirthday(birthday);

                list.add(dto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(rs, pstmt, conn);
        }

        return list;
    }

    public void personInsert(PersonDto dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into person values (seq_person.nextval,?,?,?,?,?,?)";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getBlood());
            pstmt.setInt(3, dto.getJava());
            pstmt.setInt(4, dto.getSpring());
            pstmt.setDouble(5, dto.getHeight());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            pstmt.setString(6, sdf.format(dto.getBirthday()));

            pstmt.execute();
            System.out.println("add data success.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
    }

    public int personDelete(String name) {
        int n = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "delete from person where name=?";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            n = pstmt.executeUpdate();
            System.out.println("n : " + n);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }

        return n;
    }

    public int personUpdate(PersonDto dto) {
        // TODO Auto-generated method stub
        int n = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "update person set name=?, blood=?, java=?, spring=? where num=?";
        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getBlood());
            pstmt.setInt(3, dto.getJava());
            pstmt.setInt(4, dto.getSpring());
            pstmt.setInt(5, dto.getNum());

            n = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
        return n;
    }

    public List<PersonDto> searchByBlood(String _blood) {
        // TODO Auto-generated method stub
        List<PersonDto> list = new ArrayList<PersonDto>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from person where blood=? order by name";
        conn = db.getConnection();
        System.out.println(sql);

        try {
            System.out.println(_blood.toLowerCase());
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, _blood.toLowerCase());

            rs = pstmt.executeQuery();
            while (rs.next()) {
                PersonDto dto = new PersonDto();
                int java = rs.getInt("java");
                int spring = rs.getInt("spring");
                String name = rs.getString("name");
                double height = rs.getDouble("height");
                Date birthday = rs.getDate("birthday");

                dto.setJava(java);
                dto.setSpring(spring);
                dto.setName(name);
                dto.setHeight(height);
                dto.setBirthday(birthday);
                dto.setNum(rs.getInt("num"));
                dto.setBlood(rs.getString("blood"));


                list.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(rs, pstmt, conn);
        }

        return list;
    }
}
