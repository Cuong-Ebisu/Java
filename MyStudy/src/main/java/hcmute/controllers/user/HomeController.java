package hcmute.controllers.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hcmute.models.CategoryModels;
import hcmute.models.ProductModel;
import hcmute.services.CategoryServiceImpl;
import hcmute.services.ICategotyService;
import hcmute.services.IProductService;
import hcmute.services.ProductServiceImpl;

@WebServlet(urlPatterns = {"/home", "/listprocate", "detail"})
public class HomeController extends HttpServlet{


	private static final long serialVersionUID = 1L;
	ICategotyService cateService = new CategoryServiceImpl();
	IProductService proService = new ProductServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURL().toString();
		if(url.contains("home")) {
			List<ProductModel> list1 = proService.findAll();
			req.setAttribute("listpro", list1);
		}else if(url.contains("listprocate")) {
			int id = Integer.parseInt(req.getParameter("cateid"));
			
			List<ProductModel> list2 = proService.findProductByCategory(id);
			req.setAttribute("listpro", list2);
			req.setAttribute("setactive", id);
		}else if(url.contains("detail")) {
			int id = Integer.parseInt(req.getParameter("id"));
			ProductModel product = proService.findOne(id);
			req.setAttribute("product", product);
			req.getRequestDispatcher("/views/user/detail.jsp").forward(req, resp);
		}
		
		List<CategoryModels> list = cateService.findAll();
		req.setAttribute("listcate", list);
		
		List<ProductModel> countCID = proService.count();
		req.setAttribute("countCID", countCID);
		
		req.getRequestDispatcher("/views/users/home.jsp").forward(req, resp);
	}

}
