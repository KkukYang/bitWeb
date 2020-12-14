package member.servlet;

import data.member.MemberDao;
import data.member.MemberDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/member/updateform")
public class MemberUpdateFormServlet extends HttpServlet {
    MemberDao dao = new MemberDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("num");
        MemberDto dto = dao.getMember(num);



        request.setAttribute("dto", dto);
        request.getRequestDispatcher("updateform.jsp").forward(request, response);
    }
}
