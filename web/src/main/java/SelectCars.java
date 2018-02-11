import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/selectcars")
public class SelectCars extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/jsp/select_cars.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("manufacture", req.getParameter("manufacture"));
        session.setAttribute("limit", req.getParameter("limit"));
        session.setAttribute("model", req.getParameter("model"));
        session.setAttribute("minYear", req.getParameter("minYear"));
        session.setAttribute("maxYear", req.getParameter("maxYear"));
        resp.sendRedirect("/viewcars");
    }
}
