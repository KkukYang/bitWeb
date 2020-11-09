package servlet.test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/savesession")
public class ServletSessionTest extends HttpServlet {
//    private static final long serialVersionUID = 1L;

//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public ServletSessionTest() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//        super.doGet(req, resp);
        //기본이 true : 기존 세션이 있으면 그대로 사용. 없으면 생성.
        HttpSession session = req.getSession(true);

        //입력한 데이터 읽어서 세션에 저장.
        String id = req.getParameter("id");
        String hp = req.getParameter("hp");

        session.setAttribute("id", id);
        session.setAttribute("hp", hp);

        RequestDispatcher rd = req.getRequestDispatcher("day1104/ex3_result.jsp");
        rd.forward(req, resp);
//        resp.sendRedirect("day1104/ex3_result.jsp");
    }

//    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//        super.doPost(req, resp);
        doGet(req, resp);
    }
}
