package hcmute.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import hcmute.models.ProductModel;
import hcmute.services.IProductService;
import hcmute.services.ProductServiceImpl;

@WebServlet(urlPatterns = { "/listpro", "/addProduct", "/updateProduct" })
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
		maxFileSize = 1024 * 1024 * 10, // 10MB
		maxRequestSize = 1024 * 1024 * 50) // 50MB
public class ProductController extends HttpServlet {

	private static final long serialVersionUID = -1560784406881863816L;


	IProductService productService = new ProductServiceImpl();

	public static final String SAVE_DIRECTORY = "uploads";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();

		if (url.contains("listpro")) {
			findAll(req, resp);
		} else if (url.contains("addProduct")) {
			req.getRequestDispatcher("/view/addProduct.jsp").forward(req, resp);
		} else if (url.contains("updateProduct")) {
			req.setCharacterEncoding("UTF-8");
			resp.setCharacterEncoding("UTF-8");
			int productId = Integer.parseInt(req.getParameter("productId"));
			ProductModel product = productService.getProductById(productId);

			req.setAttribute("product", product);
			req.getRequestDispatcher("/view/updateProduct.jsp").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if (url.contains("addProduct")) {
			insert(req, resp);
		} else if (url.contains("updateProduct")) {
			update(req, resp);
		}
	}

	private void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		int productId = Integer.parseInt(req.getParameter("productId"));
		String name = req.getParameter("name");
		String description = req.getParameter("description");
		double price = Double.parseDouble(req.getParameter("price"));
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		String manufacturer = req.getParameter("manufacturer");
		Date releaseDate = Date.valueOf(req.getParameter("releaseDate"));

		// Xử lý upload ảnh
	    Part filePart = req.getPart("imagePath");
	    String realPath = req.getServletContext().getRealPath("/" + SAVE_DIRECTORY);
	    String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
	    String imagePath = "uploads/" + fileName;

	    // Lưu ảnh đã upload
	    filePart.write(realPath + "/" + fileName);
		ProductModel updatedProduct = new ProductModel(productId, name, description, price, quantity, manufacturer, releaseDate, fileName);
		productService.updateProduct(updatedProduct);
		resp.sendRedirect(req.getContextPath() + "/listpro");
	}

	private void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		// Retrieve form data
		String name = req.getParameter("name");
		String description = req.getParameter("description");
		double price = Double.parseDouble(req.getParameter("price"));
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		String manufacturer = req.getParameter("manufacturer");
		Date releaseDate = Date.valueOf(req.getParameter("releaseDate"));

		// Upload image
		Part filePart = req.getPart("imagePath");
		String realPath = req.getServletContext().getRealPath("/" + SAVE_DIRECTORY);
		String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
		if (!Files.exists(Paths.get(realPath))) {
			Files.createDirectory(Paths.get(realPath));
		}

		// Save the uploaded image
		filePart.write(realPath + "/" + fileName);

		// Create a new Product object
		ProductModel newProduct = new ProductModel(name, description, price, quantity, manufacturer, releaseDate,
				fileName);

		// Add the new product to the database
		productService.addProduct(newProduct);

		// Redirect to the product list page after adding
		resp.sendRedirect(req.getContextPath() + "/listpro");

	}

	private void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<ProductModel> productList = productService.findAll();
		req.setAttribute("productList", productList);

		// Forward to the JSP page for displaying the product list
		req.getRequestDispatcher("/view/listProduct.jsp").forward(req, resp);
	}
}
