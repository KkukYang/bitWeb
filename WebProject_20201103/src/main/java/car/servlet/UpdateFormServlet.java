package car.servlet;

import data.car.CarDao;
import data.car.CarDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/samsung/updateform")
public class UpdateFormServlet extends HttpServlet {
    CarDao dao = new CarDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //num
        String num = request.getParameter("num");
        //dto
        CarDto dto = dao.getData(num);
        //request
        request.setAttribute("dto", dto);
        //updateform.jsp forward
        RequestDispatcher rd = request.getRequestDispatcher("../car/updateform.jsp");
        rd.forward(request, response);
    }
}
