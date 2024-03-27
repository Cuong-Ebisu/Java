package hcmute.controllers;

import java.io.IOException;
import java.util.List;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hcmute.entity.Book;
import hcmute.services.*;

@WebServlet(urlPatterns = {"/admin-listBook","/admin-addBook","/admin-updateBook","/admin-deleteBook"})
public class bookController extends HttpServlet{

	private static final long serialVersionUID = 5668212663378442958L;

	IBookService BookService = new BookServiceImp();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if (url.contains("admin-listBook")) {
			findAll(req, resp);
		}
		else if (url.contains("admin-addBook")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/book/addBook.jsp");
			rd.forward(req, resp);
		}
		else if (url.contains("admin-updateBook")) {
			req.setCharacterEncoding("UTF-8");
			resp.setCharacterEncoding("UTF-8");
			int id = Integer.parseInt(req.getParameter("id"));
			Book book = BookService.findByID(id);
			req.setAttribute("oldBook", book);
			RequestDispatcher rd = req.getRequestDispatcher("/views/book/updateBook.jsp");
			rd.forward(req, resp);
		}
		else if (url.contains("admin-deleteBook")) {
			try {
				delete(req,resp);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	private void delete(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		int id = Integer.parseInt(req.getParameter("id"));
		BookService.delete(id);
		resp.sendRedirect(req.getContextPath() + "/admin-listBook");

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if (url.contains("admin-addBook")) {
			insert(req,resp);
		}
		else if (url.contains("admin-updateBook")) {
			update(req,resp);
		}
	}

	private void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		int id = Integer.parseInt(req.getParameter("id"));
		int isbn = Integer.parseInt(req.getParameter("bookIsbn"));
		String title = req.getParameter("bookTitle");
		String publisher = req.getParameter("bookPublisher");
		BigDecimal price = new BigDecimal(req.getParameter("bookPrice"));
		String description = req.getParameter("bookDescription");
		String dateStr = req.getParameter("bookPublish_date"); // Lấy chuỗi ngày tháng từ request
		Date publish_date = Date.valueOf((req.getParameter("bookPublish_date")));
		String cover_image = req.getParameter("bookCover_image");
		int quantity = Integer.parseInt(req.getParameter("bookQuantity"));
		Book book = new Book();
		book.setBookid(id);
		book.setIsbn(isbn);
		book.setTitle(title);
		book.setPublisher(publisher);
		book.setPrice(price);
		book.setDescription(description);
		book.setPublish_date(publish_date);
		book.setCover_image(cover_image);
		book.setQuantity(quantity);
		BookService.update(book);
		resp.sendRedirect(req.getContextPath() + "/admin-listBook");
	}
	private void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		int isbn = Integer.parseInt(req.getParameter("bookIsbn"));
		String title = req.getParameter("bookTitle");
		String publisher = req.getParameter("bookPublisher");
		BigDecimal price = new BigDecimal(req.getParameter("bookPrice"));
		String description = req.getParameter("bookDescription");
		String dateStr = req.getParameter("bookPublish_date"); // Lấy chuỗi ngày tháng từ request
		Date publish_date = Date.valueOf((req.getParameter("bookPublish_date")));
		
		String cover_image = req.getParameter("bookCover_image");
		int quantity = Integer.parseInt(req.getParameter("bookQuantity"));
		Book book = new Book();

		book.setIsbn(isbn);
		book.setTitle(title);
		book.setPublisher(publisher);
		book.setPrice(price);
		book.setDescription(description);
		book.setPublish_date(publish_date);
		book.setCover_image(cover_image);
		book.setQuantity(quantity);
		BookService.insert(book);
		resp.sendRedirect(req.getContextPath() + "/admin-listBook");
	}

	private void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Book> listBook = BookService.findAll();
		req.setAttribute("list", listBook);
		RequestDispatcher rd = req.getRequestDispatcher("/views/book/listBook.jsp");
		rd.forward(req, resp);
	}


}







