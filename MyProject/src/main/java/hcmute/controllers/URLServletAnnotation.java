package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/hello","/xin-chao"})
public class URLServletAnnotation extends HttpServlet{

	private static final long serialVersionUID = -2583863117064279283L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter printW = resp.getWriter();
		printW.println("<h1>HelloWorld</h1>");
		
		printW.close();
	}
}
