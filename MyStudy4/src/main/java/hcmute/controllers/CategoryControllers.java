package hcmute.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hcmute.DAO.DBConnectionSQLServer;
import hcmute.models.CategoryModels;
import hcmute.services.CategoryServiceImpl;
import hcmute.services.ICategoryService;

@WebServlet(urlPatterns = {"/listcate","/addcate","/update","/delete"})
public class CategoryControllers extends HttpServlet{

	/**
	 * 
	 */
	//goi cac phuong thuc trong service
	ICategoryService cateService = new CategoryServiceImpl();
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if(url.contains("listcate")) {
			
		
		findAll(req,resp);
		}
		else if(url.contains("addcate")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/addCategory.jsp");
			rd.forward(req, resp);
		}
		else if(url.contains("update")) {
			req.setCharacterEncoding("UTF-8");
			resp.setCharacterEncoding("UTF-8");
			//nhan du lieu tu view
			
			int id = Integer.parseInt(req.getParameter("id"));
			
			//goi phuong thuc fidnOne trong service
			
			CategoryModels model= cateService.findOne(id);
			
			req.setAttribute("cate", model);
			
			RequestDispatcher rd = req.getRequestDispatcher("/views/updateCategory.jsp");
			rd.forward(req, resp);
		}
		else if(url.contains("delete")) {
			int id = Integer.parseInt(req.getParameter("id"));
			
			cateService.delete(id);
			
			CategoryModels model= cateService.findOne(id);
			
			req.setAttribute("message", "da xoa thanh cong");
			

			RequestDispatcher rd = req.getRequestDispatcher("listcate");
			rd.forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url=req.getRequestURI().toString();
		if(url.contains("addcate")) {
			insert(req,resp);
		}else if(url.contains("update")) {
			update(req,resp);
		}
	}
	private void update(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.setCharacterEncoding("UTF-8");
		
		resp.setCharacterEncoding("UTF-8");
		
		//nhan du lieu tu form
		
	
		String cateName = req.getParameter("cateName");
		String images = req.getParameter("image");
		int cateID = Integer.parseInt(req.getParameter("cateID"));
		
		//dua du lieu vao model
		CategoryModels cate = new CategoryModels();
		
		cate.setCateID(cateID);
		cate.setCateName(cateName);
		cate.setImage(images);
		//goi phuong thuc insert trong service
		cateService.update(cate);
		//tra ve view
		resp.sendRedirect(req.getContextPath()+"/listcate");
		
	}
	private void insert(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.setCharacterEncoding("UTF-8");
		
		resp.setCharacterEncoding("UTF-8");
		
		//nhan du lieu tu form
		
		String cateName = req.getParameter("cateName");
		String images = req.getParameter("images");
		
		//dua du lieu vao model
		CategoryModels cate = new CategoryModels();
		
		cate.setCateName(cateName);
		cate.setImage(images);
		//goi phuong thuc insert trong service
		cateService.insert(cate);
		//tra ve view
		resp.sendRedirect(req.getContextPath()+"/listcate");
	}
	private void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<CategoryModels> listcate = cateService.findAll();
		
		
		//day du lieu ra view
		req.setAttribute("list", listcate);
		
		//view nhan du lieu
		RequestDispatcher rd = req.getRequestDispatcher("/views/listCategory.jsp");
		rd.forward(req, resp);
		
	}
}