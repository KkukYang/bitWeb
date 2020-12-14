package dayLecture.day0928;

import oracle.db.OracleConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SawonDao {
    OracleConnect db = OracleConnect.getInstance();

    public List<SawonDto> getSearchList(String col, String search) {
        List<SawonDto> list = new ArrayList<>();
        Connection conn = db.getConnection();
        Statement stmt = null;
        ResultSet rs = null;

        String sql = "";
        String[] ddi = "원숭이,닭,개,돼지,쥐,소,호랑이,토끼,용,뱀,말,양".split(",");

        if (col.equals("all")) {
            sql = "select * from sawon order by num";
        } else if (col.equals("name")) {
            sql = "select * from sawon where name like '%" + search + "%' order by num";
        } else {
            sql = "select * from sawon where buseo like '%" + search + "%' order by num";
        }

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                SawonDto dto = new SawonDto();
                dto.setNum(rs.getString("num"));
                dto.setName(rs.getString("name"));
                dto.setBuseo(rs.getString("buseo"));
                dto.setPay(rs.getInt("pay"));
                dto.setPaytax(rs.getInt("paytax"));
                String jumin = rs.getString("juminno");
                dto.setJuminno(jumin);
                String ipsaday = rs.getString("ipsaday").substring(0, 10);

                dto.setIpsaday(ipsaday);

                int y = Integer.parseInt(jumin.substring(0, 2));
                System.out.println(y);
                char g = jumin.charAt(7);
                if (g == '1' || g == '2' || g == '5' || g == '6') {
                    y += 1900;
                } else {
                    y += 2000;
                }
                System.out.println(y);
                dto.setDdi(ddi[y % 12]);
                String gender = "";
                if (g == '1' || g == '3' || g == '5') {
                    gender = "남성";
                } else {
                    gender = "여성";
                }
                dto.setGender(gender);

                list.add(dto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(rs, stmt, conn);
        }

        return list;
    }

    public List<SawonDto> getSearchList() {
        return getSearchList("all", "");
    }

    public void sawonInsert(SawonDto dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        String sql = "insert into sawon values (seq_sawon.nextval,?,?,?,?,?,?)";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getBuseo());
            pstmt.setInt(3, dto.getPay());
            pstmt.setInt(4, dto.getPaytax());
            pstmt.setDate(5, Date.valueOf(dto.getIpsaday()));
            pstmt.setString(6, dto.getJuminno());

            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
    }

    public void sawonUpdate(SawonDto dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        String sql = "update sawon set name=?,buseo=?,pay=?,paytax=?,ipsaday=?,juminno=? where num=?";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getBuseo());
            pstmt.setInt(3, dto.getPay());
            pstmt.setInt(4, dto.getPaytax());
            pstmt.setDate(5, Date.valueOf(dto.getIpsaday()));
            pstmt.setString(6, dto.getJuminno());

            pstmt.setInt(7, Integer.parseInt(dto.getNum()));

            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
    }

    public void sawonDelete(String num) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        String sql = "delete from sawon where num=?";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, num);
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
    }
}
