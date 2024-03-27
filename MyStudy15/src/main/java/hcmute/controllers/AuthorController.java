package hcmute.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/viewhome", "ViewServlet"})
public class AuthorController extends HttpServlet{

	private static final long serialVersionUID = -1829296333147671935L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if (url.contains("admin-viewhome")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/viewhome.jsp");
			rd.forward(req, resp);
		}
	}

}
