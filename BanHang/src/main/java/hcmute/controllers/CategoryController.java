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

import hcmute.models.CategoryModels;
import hcmute.services.CategoryServiceImpl;
import hcmute.services.ICategotyService;

@WebServlet(urlPatterns = { "/listcate", "/addcate", "/update", "/delete" })
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 8204386410988297301L;

	// goi cac phuong thuc trong service
	ICategotyService cateService = new CategoryServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();

		if (url.contains("listcate")) {
			findAll(req, resp);
		} else if (url.contains("addcate")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/addCategory.jsp");
			rd.forward(req, resp);
		} else if (url.contains("update")) {
			req.setCharacterEncoding("UTF-8");
			resp.setCharacterEncoding("UTF-8");

			// nhan du lieu tu view
			int id = Integer.parseInt(req.getParameter("id"));

			// goi phuong thuc findOne trong service
			CategoryModels model = cateService.findOne(id);

			// day du lieu view
			req.setAttribute("cate", model);

			RequestDispatcher rd = req.getRequestDispatcher("/views/updateCategory.jsp");
			rd.forward(req, resp);
		} else if (url.contains("delete")) {
			// nhan du lieu tu view
			int id = Integer.parseInt(req.getParameter("id"));

			// goi phuong thuc findOne trong service
			cateService.delete(id);

			// day du lieu view
			req.setAttribute("message", "Da xoa thanh cong");

			RequestDispatcher rd = req.getRequestDispatcher("listcate");
			rd.forward(req, resp);

		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if (url.contains("addcate")) {
			insert(req, resp);
		} else if (url.contains("update")) {
			update(req, resp);
		}
	}

	private void update(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// thiet lap ngon ngu
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		// nhan du lieu tu form
		int id = Integer.parseInt(req.getParameter("cateID"));
		String cateName = req.getParameter("cateName");
		String images = req.getParameter("images");
		// nhan du lieu dua vao model
		CategoryModels cate = new CategoryModels();
		cate.setCateID(id);
		cate.setCateName(cateName);
		cate.setImages(images);
		// goi phuong thuc vao model
		cateService.update(cate);
		// tra ve view
		resp.sendRedirect(req.getContextPath() + "/listcate");

	}

	private void insert(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// thiet lap ngon ngu
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		// nhan du lieu tu form
		String cateName = req.getParameter("cateName");
		String images = req.getParameter("images");
		// nhan du lieu dua vao model
		CategoryModels cate = new CategoryModels();
		cate.setCateName(cateName);
		cate.setImages(images);
		// goi phuong thuc vao model
		cateService.insert(cate);
		// tra ve view
		resp.sendRedirect(req.getContextPath() + "/listcate");

	}

	private void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<CategoryModels> listcate = cateService.findAll();

		// day du lieu ra view
		req.setAttribute("list", listcate);
		/*Dữ liệu trong danh mục listcate được đặt trong thuộc tính của yêu cầu req
		 * với tên "list". Điều này cho phép trang JSP truy cập và sử dụng dữ liệu này để 
		 * hiển thị trên trang web*/

		// view nhan du lieu
		RequestDispatcher rd = req.getRequestDispatcher("/views/listCategory.jsp");
		
		/*Đây là một cách để lấy một đối tượng 'RequestDispatcher, mà sau đó sẽ được
		 * sử dụng để chuyển hướng yêu cầu tới trang JSP 'listCategory.jsp'.
		 * Đường dẫn '/views/listCategory.jsp' là đường dẫn đến trang JSP mà chúng
		 * ta muốn hiển thị danh sách mục trên đó*/
		rd.forward(req, resp);
		/*Cuối cùng 'RequestDispatcher' được sử dụng để chuyển tiếp yêu cầu và phản hồi tới trang JSP
		 * 'listCategory.jsp'. Trang JSP này sau đó sử dụng dữ liệu danh sách danh mục được đặt trong thuộc tính 'list'
		 * của yêu cầu để hiển thị danh sách các danh mục lên trình duyệt web của người dùng.*/
	}

}