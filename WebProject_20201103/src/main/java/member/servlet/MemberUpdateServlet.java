package member.servlet;

import data.member.MemberDao;
import data.member.MemberDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/member/update")
public class MemberUpdateServlet extends HttpServlet {
    MemberDao dao = new MemberDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        MemberDto dto = new MemberDto();
        String num = request.getParameter("num");
        String name = request.getParameter("name");
        String hp = request.getParameter("hp");
        String addr = request.getParameter("addr");

        dto.setNum(num);
        dto.setName(name);
        dto.setHp(hp);
        dto.setAddr(addr);

        dao.updateMember(dto);
        response.sendRedirect("list");
    }
}
