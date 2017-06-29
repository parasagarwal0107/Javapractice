import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GoogleLink")
public class GoogleLink extends HttpServlet {
	public void doget(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		res.sendRedirect("http://www.google.com");

		pw.close();
	}

}
