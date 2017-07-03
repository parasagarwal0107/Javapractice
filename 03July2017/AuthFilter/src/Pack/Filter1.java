package Pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class Filter1 implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {

		PrintWriter out = resp.getWriter();

		String password = req.getParameter("password");
		if (password.equals("paras")) {
			chain.doFilter(req, resp);
		} else {
			out.print("Error");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, resp);
		}

	}

	public void destroy() {
	}

}