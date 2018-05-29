import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int number1 = Integer.valueOf(req.getParameter("number1"));
        int number2 = Integer.valueOf(req.getParameter("number2"));

        resp.getWriter().write("Result is : " + (number1 + number2));
    }
}
