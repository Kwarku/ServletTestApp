import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Calculator/show")
public class CalculatorPostServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();


        out.print("Delta równienia :");
        out.print(req.getParameter("a") + "x^2 + ");
        out.print(req.getParameter("b") + "x + ");
        out.println(req.getParameter("c"));
        out.println("to: " + countDelta(req));
    }

    private int countDelta(HttpServletRequest req) {
        if (!req.getParameter("isSquare").isEmpty()) {
            int parmA = Integer.valueOf(req.getParameter("a"));
            int parmB = Integer.valueOf(req.getParameter("b"));
            int parmC = Integer.valueOf(req.getParameter("c"));

            return parmB * parmB - 4 * parmA * parmC;
        }
        return Integer.MIN_VALUE;
    }


}
