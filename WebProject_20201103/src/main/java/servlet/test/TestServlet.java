package servlet.test;

import object.test.TestDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

@WebServlet("/testServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<TestDto> list = new Vector<TestDto>();
        list.add(new TestDto("asdf","red",1234));
        list.add(new TestDto("qwer","orange",3456));

        request.setAttribute("list", list);
//        RequestDispatcher rd = request.getRequestDispatcher("day1103/ex09_result.jsp");
        RequestDispatcher rd = request.getRequestDispatcher("day1103/ex05_forward.jsp");
        rd.forward(request, response);
    }
}
