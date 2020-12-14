package data.member;

import mybatis.setting.ConnectionManager;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MemberDao {
    ConnectionManager manager = ConnectionManager.getInstance();
    SqlSession session;

    private SqlSession getSession() {
        session = manager.openSession();
        return session;
    }


    ///////////////////////////////////////////////////////////////

    public int getTotalCount() {
        session = this.getSession();
        int total = session.selectOne("member.totalCount");
        session.close();

        return total;
    }

    public List<MemberDto> getAllMember() {
        List<MemberDto> list = null;
        session = this.getSession();
        list = session.selectList("member.getAllMember");
        session.close();

        return list;
    }

    public void insertMember(MemberDto dto) {
        session = this.getSession();
        session.insert("member.insertMember", dto);
        session.close();
    }


    public MemberDto getMember(String num) {
        MemberDto dto = null;
        session = this.getSession();
        dto = session.selectOne("member.getMember", num);
        session.close();
        return dto;
    }

    public void updateMember(MemberDto dto) {
        session = this.getSession();
        session.update("member.updateMember", dto);
        session.close();
    }

    public void deleteMember(String num) {
        session = this.getSession();
        session.update("member.deleteMember", num);
        session.close();
    }
}
