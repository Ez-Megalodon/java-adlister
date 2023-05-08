import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        if (username != null){
            out.println("<h3> Hello, " + username + "!</h3>");
        } else {
            out.println("<h3>Hello, World!</h3>");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("username");
        String carName = req.getParameter("carType");
        String carAwd = req.getParameter("carAwd");
        resp.setContentType("text/html");

        out.println("<h2> Welcome, " + username + "!</h2>");
        out.println("I like " + carName + "!");

        if (carAwd.equalsIgnoreCase("carAwd")){
            out.println("Wow i wish my car was AWD!");
        } else {
            out.println("You should consider getting an AWD car if you live in a winter state!");
        }
    }
}
