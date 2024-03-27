package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hcmute.services.IUserService;
import hcmute.services.UserService;

@WebServlet(urlPatterns = { "/index", "/login", "/LoginServlet", "/ProfileServlet", "/LogoutServlet" })
public class UserController extends HttpServlet {

	private static final long serialVersionUID = 2349476869787035432L;

	IUserService userService = new UserService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();

		if (url.contains("index")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/index.jsp");
			rd.forward(req, resp);
		} else if (url.contains("login")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
			rd.forward(req, resp);
		} else if (url.contains("ProfileServlet")) {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();

			req.getRequestDispatcher("/views/link.jsp").include(req, resp);

			Cookie ck[] = req.getCookies();
			String name = null;
			if(ck != null) {
				for (Cookie cookie : ck) {
					if (cookie.getName().equals("name")) {
						name = cookie.getValue();
						break;
					}
				}
			}
			if(name != null) {
				out.print("<b>Welcome to Profile</b>");
				out.print("<br>Welcome, " + name);
			}else {
				out.print("Please login first");
				req.getRequestDispatcher("/views/login.jsp").include(req, resp);
			}
			out.close();
		} else if (url.contains("LogoutServlet")) {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();

			req.getRequestDispatcher("/views/link.jsp").include(req, resp);
			Cookie ck = new Cookie("name", "");

			ck.setMaxAge(0);
			resp.addCookie(ck);

			out.print("you are successfully logged out!");

		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if (url.contains("LoginServlet")) {
			login(req, resp);
		}
	}

	private void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		req.getRequestDispatcher("/views/link.jsp").include(req, resp);

		String name = req.getParameter("name");
		String password = req.getParameter("password");

		if (userService.login(name, password)) {
			out.print("You are successfully logged in!");
			out.print("<br>Welcome, " + name);

			Cookie ck = new Cookie("name", name);
			resp.addCookie(ck);
		} else {
			out.print("Sorry, username or password error!");
			req.getRequestDispatcher("/views/login.jsp").include(req, resp);
		}
	}
}
