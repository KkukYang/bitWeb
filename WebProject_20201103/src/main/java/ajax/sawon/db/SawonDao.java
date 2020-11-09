package ajax.sawon.db;

import oracle.db.OracleConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SawonDao {
    OracleConnect db;

    public SawonDao() {
        db = OracleConnect.getInstance();
    }

    public void insertSawon(SawonDto dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into sawon (num,name,driver,gender,address,birthday) " +
                "values (seq1.nextval,?,?,?,?,?)";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getDriver());
            pstmt.setString(3, dto.getGender());
            pstmt.setString(4, dto.getAddress());
            pstmt.setString(5, dto.getBirthday());
            pstmt.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
    }

    public List<SawonDto> getSawonList() {
        List<SawonDto> list = new ArrayList<SawonDto>();
        ResultSet rs = null;

        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "select * from sawon order by num asc";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                SawonDto dto = new SawonDto();
                dto.setNum(rs.getString("num"));
                dto.setName(rs.getString("name"));
                dto.setDriver(rs.getString("driver"));
                dto.setGender(rs.getString("gender"));
                dto.setAddress(rs.getString("address"));
                dto.setBirthday(rs.getString("birthday"));
                list.add(dto);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.dbClose(rs, pstmt, conn);
        }

        return list;
    }

    public SawonDto getData(String num) {
        SawonDto dto = new SawonDto();
        ResultSet rs = null;

        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "select * from sawon where num=?";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, num);
            rs = pstmt.executeQuery();

            rs.next();
            dto.setNum(rs.getString("num"));
            dto.setName(rs.getString("name"));
            dto.setDriver(rs.getString("driver"));
            dto.setGender(rs.getString("gender"));
            dto.setAddress(rs.getString("address"));
            dto.setBirthday(rs.getString("birthday"));

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.dbClose(rs, pstmt, conn);
        }

        return dto;
    }

    public void updateSawon(SawonDto dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "update sawon set name=?,driver=?,gender=?,address=?,birthday=? where num=?";

        conn = db.getConnection();
        System.out.println("updateSawon:" + dto.getNum());

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getDriver());
            pstmt.setString(3, dto.getGender());
            pstmt.setString(4, dto.getAddress());
            pstmt.setString(5, dto.getBirthday());
            pstmt.setString(6, dto.getNum());
            pstmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
    }

    public void deleteSawon(String num) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "delete from sawon where num=?";

        conn = db.getConnection();
        System.out.println("num:" + num);

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, num);
            pstmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
    }
}
