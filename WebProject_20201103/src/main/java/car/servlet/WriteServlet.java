package car.servlet;

import data.car.CarDao;
import data.car.CarDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/samsung/write")
public class WriteServlet extends HttpServlet {

    CarDao dao = new CarDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        CarDto dto = new CarDto();
        String carname = request.getParameter("carname");
        String carcolor = request.getParameter("carcolor");
        String carguip = request.getParameter("carguip");
        int carprice = Integer.parseInt(request.getParameter("carprice"));

        dto.setCarname(carname);
        dto.setCarcolor(carcolor);
        dto.setCarguip(carguip);
        dto.setCarprice(carprice);

        dao.insertCar(dto);

        //list servlet 으로 가서 데이터를 가져온 후 -> jsp 로 이동한 뒤 출력.
        response.sendRedirect("list");

    }
}
