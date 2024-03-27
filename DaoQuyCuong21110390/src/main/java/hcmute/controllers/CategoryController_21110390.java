package hcmute.controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hcmute.entity.Category;
import hcmute.services.CategoryServiceImpl_21110390;
import hcmute.services.ICategoryService_21110390;

@WebServlet(urlPatterns = {"/admin-viewhome", "/admin-ViewServlet", "/admin-addCate", "/admin-update", "/admin-delete"})
public class CategoryController_21110390 extends HttpServlet{

	private static final long serialVersionUID = 3020269632646421102L;

	ICategoryService_21110390 cateService = new CategoryServiceImpl_21110390();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if (url.contains("admin-viewhome")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/viewhome_21110390.jsp");
			rd.forward(req, resp);
		}else if(url.contains("admin-ViewServlet")) {
			String spageid = req.getParameter("page");
			int countuser = cateService.countCategory();
			int pageid = Integer.parseInt(spageid);
			int total = 3;
			int countPage = countuser/total + (countuser%total==0?0:1);
			if(pageid ==1) {}
			else {
				pageid = pageid-1;
				pageid = pageid*total +1;
			}
			List<Category> list = cateService.findAll(pageid, total);
			
			req.setAttribute("list", list);
			req.setAttribute("spageid", spageid);
			req.setAttribute("count", countPage);
			
			RequestDispatcher rd = req.getRequestDispatcher("/views/viewCate_21110390.jsp");
			rd.forward(req, resp);
		}else if (url.contains("admin-addCate")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/addCate_21110390.jsp");
			rd.forward(req, resp);
		}else if (url.contains("admin-update")) {
			req.setCharacterEncoding("UTF-8");
			resp.setCharacterEncoding("UTF-8");
			int id = Integer.parseInt(req.getParameter("id"));
			Category cate = cateService.findByID(id);
			req.setAttribute("oldCate", cate);
			RequestDispatcher rd = req.getRequestDispatcher("/views/updateCate_21110390.jsp");
			rd.forward(req, resp);
		}else if (url.contains("admin-delete")) {
			try {
				delete(req,resp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	private void delete(HttpServletRequest req, HttpServletResponse resp) throws Exception{
		int id = Integer.parseInt(req.getParameter("id"));
		cateService.delete(id);
		resp.sendRedirect(req.getContextPath() + "/admin-viewhome");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if (url.contains("admin-addCate")) {
			insert(req,resp);
		}else if (url.contains("admin-update")) {
			update(req,resp);
		}
	}
	private void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(req.getParameter("id"));
		String categoryName = req.getParameter("categoryName");
		String categoryCode = req.getParameter("categoryCode");
		String images = req.getParameter("images");
		boolean status = Boolean.parseBoolean(req.getParameter("status"));
		
		Category cate = new Category();
		cate.setCategoryId(id);
		cate.setCategoryName(categoryName);
		cate.setCategoryCode(categoryCode);
		cate.setImages(images);
		cate.setStatus(status);
		
		cateService.update(cate);
		resp.sendRedirect(req.getContextPath() + "/admin-viewhome");
	}
	private void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		String categoryName = req.getParameter("categoryName");
		String categoryCode = req.getParameter("categoryCode");
		String images = req.getParameter("images");
		boolean status = Boolean.parseBoolean(req.getParameter("status"));
		

		Category cate = new Category();

		cate.setCategoryName(categoryName);
		cate.setCategoryCode(categoryCode);
		cate.setImages(images);
		cate.setStatus(status);
		
		cateService.insert(cate);

		resp.sendRedirect(req.getContextPath() + "/admin-viewhome");
	}

}
