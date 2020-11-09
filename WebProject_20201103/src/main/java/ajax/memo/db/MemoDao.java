package ajax.memo.db;

import oracle.db.OracleConnect;

import java.sql.*;
import java.util.Vector;

public class MemoDao {

    OracleConnect db;

    public MemoDao() {
        db = OracleConnect.getInstance();
    }

    //insert
    public void memoInsert(MemoDto dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "insert into memo (num, nickname, content, avata, writeday)" +
                " values(seq1.nextval,?,?,?,sysdate)";
        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getNickname());
            pstmt.setString(2, dto.getContent());
            pstmt.setString(3, dto.getAvata());
            pstmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
    }

    public Vector<MemoDto> getAllDatas() {
        Vector<MemoDto> list = new Vector<MemoDto>();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from memo order by num desc";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                MemoDto dto = new MemoDto();
                dto.setNum(rs.getString("num"));
                dto.setNickname(rs.getString("nickname"));
                dto.setContent(rs.getString("content"));
                dto.setAvata(rs.getString("avata"));
                dto.setLikes(rs.getInt("likes"));
                Timestamp ts = rs.getTimestamp("writeday");
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                dto.setWriteday(ts);

                list.add(dto);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.dbClose(rs, pstmt, conn);
        }

        return list;
    }

    public void memoDelete(String num) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "delete from memo where num=?";

        conn = db.getConnection();

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

    public MemoDto getData(String num) {
        MemoDto dto = new MemoDto();

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from memo where num=?";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, num);

            rs = pstmt.executeQuery();
            rs.next();
            dto.setNum(rs.getString("num"));
            dto.setNickname(rs.getString("nickname"));
            dto.setContent(rs.getString("content"));
            dto.setAvata(rs.getString("avata"));
            dto.setLikes(rs.getInt("likes"));
            dto.setWriteday(rs.getTimestamp("writeday"));

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }

        return dto;
    }

    public void memoUpdate(MemoDto dto) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "update memo set nickname=?, content=?, avata=?, likes=? where num=?";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dto.getNickname());
            pstmt.setString(2, dto.getContent());
            pstmt.setString(3, dto.getAvata());
            pstmt.setInt(4, dto.getLikes());
            pstmt.setInt(5, Integer.parseInt(dto.getNum()));
            pstmt.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
    }

    //add 1 likes.
    public void memoUpdateLikes(String num) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "update memo set likes=likes+1 where num=?";

        conn = db.getConnection();

        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(num));
            pstmt.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn);
        }
    }
}
