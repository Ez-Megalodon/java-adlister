import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/count")
public class CountServlet extends HttpServlet {

    private static int counter = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String count = req.getParameter("count");

        if (count == null){
            counter++;
            String title = "Number of Visits:";
            out.println("<h1>" + title + "</h1>");
            out.println("<p> Hits: " + counter);
            out.println("<p>To reset the counter: pass a query where \"?count=reset\"</p>");
        } else if (count.equalsIgnoreCase("reset")){
            counter = 0;
            out.println("<p>counter reset! please navigate back to the count page!<p>");
        }
    }
}
