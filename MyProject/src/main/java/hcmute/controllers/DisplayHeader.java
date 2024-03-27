package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/DisplayHeader"})
public class DisplayHeader extends HttpServlet{

	private static final long serialVersionUID = -5438892567312862580L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String title = "Vi du doc thong tin HTTP Header";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 "
		+ "transitional//en\">\n";
		out.println(docType + "<html>\n" + "<head><title>" + title
		+ "</title></head>\n"
		+ "<body bgcolor = \"#f0f0f0\">\n"
		+ "<h1 align = \"center\">" + title + "</h1>\n"
		+ "<table width = \"100%\" border = \"1\" align = \"center\">\n"
		+ "<tr bgcolor = \"#949494\">\n"
		+ "<th>Header Name</th><th>Header Value(s)</th>\n"
		+ "</tr>\n");
		// get header names
		@SuppressWarnings("rawtypes")
		Enumeration headerNames = req.getHeaderNames();
		while(headerNames.hasMoreElements()) {
			String paramName = (String)headerNames.nextElement();
			out.println("<tr><td>" + paramName + "</td>\n");
			String paramValue = req.getHeader(paramName);
			out.println("<td>" + paramValue + "</td></tr>\n");
			
		}
		out.println("</table>\n</body></html>");
	}
}
