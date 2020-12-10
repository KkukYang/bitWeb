package car.servlet;

import data.car.CarDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/samsung/list")
public class ListServlet extends HttpServlet {

    CarDao dao = new CarDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //총 갯수 구하기.
        int totalCount = dao.getTotalCount();

        request.setAttribute("totalCount", totalCount);


        RequestDispatcher rd = request.getRequestDispatcher("../car/carlist.jsp");
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
