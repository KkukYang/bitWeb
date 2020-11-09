package servlet.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class servlet.test.HelloServlet
 */
@WebServlet("/kakao/my/hello.do")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
        response.setContentType("text/html; charset=UTF-8");
        // 브라우저에 출력하기 위한 변수 선언.
        PrintWriter out = response.getWriter();
        out.print("<html><hdad><title>Servlet Test</title></head>");
        out.print("<body>");
        out.print("<h2>Method type:" + request.getMethod() + "</h2>");
        out.print("<h2 style='color:red;'>have a nice day</h2>");
        out.print("<h2 style='color:green;'>서블릿 테스트 중</h2>");
        out.print("<img src='../../image/c1.png'");

        out.print("</body></html>");
    }

    /**
     * getServletContext().getRealPath("/filepathInContext")
     *
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
