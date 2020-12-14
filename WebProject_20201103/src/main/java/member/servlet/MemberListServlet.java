package member.servlet;

import data.member.MemberDao;
import data.member.MemberDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/member/list")
public class MemberListServlet extends HttpServlet {
    MemberDao dao = new MemberDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int totalCount = 0;
        totalCount = dao.getTotalCount();
        List<MemberDto> list = dao.getAllMember();

        request.setAttribute("totalcount", totalCount);
        request.setAttribute("list", list);

        System.out.println(request.getRequestURI());
        request.getRequestDispatcher("memberlist.jsp").forward(request, response);

    }
}
