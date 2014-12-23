package slava.namespace.com;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Slava_algo_trading_appServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
