package servlet.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class servlet.test.ReadServlet
 */
@WebServlet("/shop/read")
public class ReadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        // 브라우저에 출력하기 위한 변수 선언.
        PrintWriter out = response.getWriter();
        System.out.println("get");

        String fruit = request.getParameter("fruit");
        out.print("<html><body>");
        out.print("<h2>내가좋아하는 과일은 " + fruit + "입니다.</h2>");
        out.print("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        // 브라우저에 출력하기 위한 변수 선언.
        PrintWriter out = response.getWriter();
        System.out.println("post");

        request.setCharacterEncoding("utf-8");
        String message = request.getParameter("message");
        out.print("<html><body>");
        out.print("<h2>message:" + message + "</h2>");
        out.print("</body></html>");
    }

}
