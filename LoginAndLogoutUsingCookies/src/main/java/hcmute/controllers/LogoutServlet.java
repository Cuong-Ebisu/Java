package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/LogoutServlet"})
public class LogoutServlet  extends HttpServlet{

	private static final long serialVersionUID = 4871150450982517123L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, resp);
		Cookie ck = new Cookie("name","");
		
		ck.setMaxAge(0);
		resp.addCookie(ck);
		
		out.print("you are successfully logged out!");
		
	}
}
