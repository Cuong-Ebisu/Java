package hcmute.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hcmute.models.UserModel;
import hcmute.services.IUserService;
import hcmute.services.UserServiceImpl;

@WebServlet(urlPatterns = {"/viewhome", "/ViewServlet"})
public class UserController extends HttpServlet{

	private static final long serialVersionUID = -3299944851121131885L;

	IUserService userService = new UserServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if (url.contains("viewhome")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/viewhome.jsp");
			rd.forward(req, resp);
		}else if(url.contains("ViewServlet")) {
			String spageid = req.getParameter("page");
			int countuser = userService.countUser();
			int pageid = Integer.parseInt(spageid);
			int total = 3;
			int countPage = countuser/total + (countuser%total==0?0:1);
			if(pageid ==1) {}
			else {
				pageid = pageid-1;
				pageid = pageid*total +1;
			}
			List<UserModel> list = userService.getUser(pageid, total);
			
			req.setAttribute("list", list);
			req.setAttribute("spageid", spageid);
			req.setAttribute("count", countPage);
			
			RequestDispatcher rd = req.getRequestDispatcher("/views/viewUser.jsp");
			rd.forward(req, resp);
		}
	}

}
