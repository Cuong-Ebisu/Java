package hcmute.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hcmute.entity.Author;
import hcmute.services.AuthorServiceImpl;
import hcmute.services.IAuthorService;

@WebServlet(urlPatterns = {"/admin-viewhome", "/admin-ViewServlet"})
public class AuthorController extends HttpServlet{

	private static final long serialVersionUID = 2201435407125559318L;

	IAuthorService authorService = new AuthorServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if (url.contains("admin-viewhome")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/viewhome.jsp");
			rd.forward(req, resp);
		}else if(url.contains("admin-ViewServlet")) {
			String spageid = req.getParameter("page");
			int countuser = authorService.countAuthor();
			int pageid = Integer.parseInt(spageid);
			int total = 6;
			int countPage = countuser/total + (countuser%total==0?0:1);
			if(pageid ==1) {}
			else {
				pageid = pageid-1;
				pageid = pageid*total +1;
			}
			List<Author> list = authorService.findAll(pageid, total);
			
			req.setAttribute("list", list);
			req.setAttribute("spageid", spageid);
			req.setAttribute("count", countPage);
			
			RequestDispatcher rd = req.getRequestDispatcher("/views/viewUser.jsp");
			rd.forward(req, resp);
		}
	}
}
