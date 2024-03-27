package hcmute.controllers;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hcmute.Entity.User;
import hcmute.services.IUserService;
import hcmute.services.UserServiceImpl;

@WebServlet("/register")
public class userController extends HttpServlet{

	private static final long serialVersionUID = 3006855417910587457L;

	IUserService userService = new UserServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		String uname = req.getParameter("name");
		String uemail = req.getParameter("email");
		String upwd = req.getParameter("pass");
		String umobile = req.getParameter("contact");
		
		User user = new User();
		user.setUname(uname);
		user.setUemail(uemail);
		user.setUpwd(upwd);
		user.setUmobile(umobile);
		
		String status = userService.signup(user);
		RequestDispatcher rd = req.getRequestDispatcher("registration.jsp");
		req.setAttribute("status", status);
		rd.forward(req, resp);
	}
}
