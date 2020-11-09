package day0925;

import oracle.db.OracleConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingDao {
    OracleConnect db = OracleConnect.getInstance();

    public void shoppingInsert(ShoppingDto dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into shopping values (seq2.nextval,?,?,?,?,?,sysdate)";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getSangpum());
            pstmt.setString(2, dto.getPhoto());
            pstmt.setInt(3, dto.getSu());
            pstmt.setInt(4, dto.getDan());
            pstmt.setString(5, dto.getColor());
//            java.sql.Date sqlDate = new Date(dto.getIpgoday().getTime());
//            pstmt.setDate(1, sqlDate);
            pstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
    }

    public List<ShoppingDto> getAllDatas() {
        List<ShoppingDto> list = new ArrayList<ShoppingDto>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "select * from shopping order by sangpum";

        conn = db.getConnection();

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ShoppingDto dto = new ShoppingDto();
                dto.setNum(rs.getInt("num"));
                dto.setSangpum(rs.getString("sangpum"));
                dto.setPhoto(rs.getString("photo"));
                dto.setSu(rs.getInt("su"));
                dto.setDan(rs.getInt("dan"));
                dto.setColor(rs.getString("color"));
                dto.setIpgoday(rs.getDate("ipgoday"));

                list.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(rs, stmt, conn);
        }

        return list;
    }

    public void shoppingUpdate(ShoppingDto dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "update shopping set sangpum=?, photo=?, su=?, dan=?, color=?, ipgoday=?";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getSangpum());
            pstmt.setString(2, dto.getPhoto());
            pstmt.setInt(3, dto.getSu());
            pstmt.setInt(4, dto.getDan());
            pstmt.setString(5, dto.getColor());

            Date sqlDate = new Date(dto.getIpgoday().getTime());
            pstmt.setDate(6, sqlDate);

            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
    }

    public void shoppingDelete(int num) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "delete from shopping where num=?";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, num);
            pstmt.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
    }
}
