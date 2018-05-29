import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delta")
public class DeltaCountingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int parmA = Integer.valueOf(req.getParameter("a"));
        int parmB = Integer.valueOf(req.getParameter("b"));
        int parmC = Integer.valueOf(req.getParameter("c"));

        double delta = parmB * parmB - 4 * (parmA * parmC);

        resp.getWriter().write("Delta of : " + parmA + "x^2 + " + parmB + "x  + " + parmC + " is : " + delta);
    }
}
