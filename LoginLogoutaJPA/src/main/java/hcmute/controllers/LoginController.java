package hcmute.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import hcmute.services.IUserService;
import hcmute.services.UserServiceImpl;

@WebServlet("/login")
public class LoginController extends HttpServlet{

	private static final long serialVersionUID = -6777549086292328374L;

	IUserService userService = new UserServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uemail = req.getParameter("username");
		String upwd = req.getParameter("password");
		HttpSession session = req.getSession();
		String uname = userService.login(uemail, upwd);
		if (uname == null) {
            req.setAttribute("status", "failed");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        } else {
            session.setAttribute("name", uname);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }

	}
}
