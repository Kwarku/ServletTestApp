import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Parameters/wypisz_parametry")
public class PosterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("Wczytywanie 3 parametrów z zadania :");
        out.println(req.getParameter("parametr1"));
        out.println(req.getParameter("parametr2"));
        out.println(req.getParameter("parametr3"));

    }
}
