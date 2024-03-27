package hcmute.controllers;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import hcmute.models.ProductModel;
import hcmute.services.ProductServiceImpl;
import hcmute.services.IProductService;

@WebServlet(urlPatterns = { "/listpro", "/findpro" })
public class ProductController extends HttpServlet {

	private static final long serialVersionUID = 8393077649949838512L;

	// goi cac phuong thuc trong service
	IProductService proService = new ProductServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();

		if (url.contains("listpro")) {
			List<ProductModel> list = proService.findAll();
			req.setAttribute("listpro", list);
			
			RequestDispatcher rd = req.getRequestDispatcher("/views/product/listProduct.jsp");
			rd.forward(req, resp);
		} else if (url.contains("findpro")) {
			int id = Integer.parseInt(req.getParameter("cateid"));
			
			List<ProductModel> list1 = proService.findProductByCategory(id);
			req.setAttribute("listpro", list1);
			
			RequestDispatcher rd = req.getRequestDispatcher("/views/product/listProduct.jsp");
			rd.forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}