package hcmute.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hcmute.models.CategoryModels;
import hcmute.services.CategoryServiceImpl;
import hcmute.services.ICategoryService;

@WebServlet(urlPatterns = {"/listcate", "/addcate", "update"})
public class CategoryController extends HttpServlet{

	private static final long serialVersionUID = -5297369846913071091L;
	
	ICategoryService cateService = new CategoryServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if(url.contains("listcate")) {
			findAll(req, resp);
		}else if(url.contains("addcate")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/addCategory.jsp");
			rd.forward(req, resp);
		}else if(url.contains("update")) {
			int id = Integer.parseInt(req.getParameter("id"));
			CategoryModels model = cateService.findOne(id);
			req.setAttribute("cate", model);
			RequestDispatcher rd = req.getRequestDispatcher("/views/updateCategory.jsp");
			rd.forward(req, resp);
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if(url.contains("addcate")) {
			insert(req, resp);
		}
	}
	private void insert(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		String cateName = req.getParameter("cateName");
		String images = req.getParameter("images");
		
		CategoryModels cate = new CategoryModels();
		
		cate.setCateName(cateName);
		cate.setImage(images);
		
		cateService.insert(cate);
		
		resp.sendRedirect("/MyStudy2/listcate");
		
	}
	private void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		List<CategoryModels> listcate = cateService.findAll();
		
		req.setAttribute("list", listcate);
		
		RequestDispatcher rd = req.getRequestDispatcher("/views/listCategory.jsp");
		rd.forward(req, resp);
	}
	
}
