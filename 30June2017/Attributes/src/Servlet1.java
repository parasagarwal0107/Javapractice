import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {

			res.setContentType("text/html");
			PrintWriter out = res.getWriter();

			ServletContext context = getServletContext();
			context.setAttribute("company", "Optimus Information");

			out.println("Welcome");
			out.println("<a href='servlet2'>visit</a>");
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}