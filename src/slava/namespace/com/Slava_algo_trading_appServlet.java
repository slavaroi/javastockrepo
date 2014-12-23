package slava.namespace.com;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Slava_algo_trading_appServlet extends HttpServlet {
	
	int num1 = 4, num2 = 3, num3 = 7;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Result of (" + num1 + " + " + num2 + ") * "+ num3 + " = 49");
	}

}
