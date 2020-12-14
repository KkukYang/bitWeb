package member.servlet;

import data.member.MemberDao;
import data.member.MemberDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/member/write")
public class MemberWriteServlet extends HttpServlet {
    MemberDao dao = new MemberDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String name = request.getParameter("name");
        String hp = request.getParameter("hp");
        String addr = request.getParameter("addr");

        MemberDto dto = new MemberDto();
        dto.setName(name);
        dto.setHp(hp);
        dto.setAddr(addr);

        dao.insertMember(dto);
        response.sendRedirect("list");

    }
}
