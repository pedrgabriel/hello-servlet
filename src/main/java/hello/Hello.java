package hello;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Hello() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head");
		out.println("<title>Hello Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello Servlet</h1>");
		out.println("Pedro Gabriel Sousa Lopes");
		out.println("</body");
		out.println("</html>");
	}
}