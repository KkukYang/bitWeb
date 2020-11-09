package day0924;

import oracle.db.OracleConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    OracleConnect db = OracleConnect.getInstance();

    public void studentInsert(StudentDto dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into student values (seq_stu.nextval,?,?,?,?,?,sysdate)";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getPhoto());
            pstmt.setString(3, dto.getHp());
            pstmt.setString(4, dto.getAddr());
            pstmt.setInt(5, dto.getBirthyear());

            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }

    }

    public List<StudentDto> getAlldatas() {
        List<StudentDto> list = new ArrayList<StudentDto>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "select * from student order by name";

        conn = db.getConnection();

        try {
            stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                StudentDto dto = new StudentDto();
                dto.setNum(rs.getString("num"));
                dto.setName(rs.getString("name"));
                dto.setAddr(rs.getString("addr"));
                dto.setHp(rs.getString("hp"));
                dto.setPhoto(rs.getString("photo"));
                dto.setBirthyear(rs.getInt("birthyear"));
                dto.setWriteday(rs.getTimestamp("writeday"));

                list.add(dto);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(rs, stmt, conn);
        }

        return list;
    }

    public void studentUpdate(StudentDto dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "update student set name=?, hp=?, addr=?, photo=?, birthyear=? where num=?";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getHp());
            pstmt.setString(3, dto.getAddr());
            pstmt.setString(4, dto.getPhoto());
            pstmt.setInt(5, dto.getBirthyear());
            pstmt.setString(6, dto.getNum());

            pstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }

    }
}
