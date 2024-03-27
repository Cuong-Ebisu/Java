package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hcmute.entity.Book;
import hcmute.entity.User;
import hcmute.services.BookServiceImp;
import hcmute.services.IBookService;
import hcmute.services.IUserService;
import hcmute.services.UserServiceImpl;
import utils.constant;


@WebServlet(urlPatterns = {"/","/unLogin-home","/user-home","/login","/admin-home","/register","/forgotpass","/waiting","/VerifyCode", "/logout"})
public class homeController  extends HttpServlet{
	private static final long serialVersionUID = -3504493453267774512L;
	IUserService userService = new UserServiceImpl();
	IBookService bookService = new BookServiceImp();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if (url.contains("login")) {
			getLogin(req,resp);
		}
		else if (url.contains("register")) {
			getRegister(req,resp);
		}
		else if (url.contains("forgotpass")) {
			req.getRequestDispatcher("views/web/forgotPassword.jsp").forward(req, resp);
		}
		else if (url.contains("waiting")) {
			getWaiting(req,resp);
		}
		else if (url.contains("VerifyCode")) {
			req.getRequestDispatcher("/views/users/verify.jsp").forward(req, resp);
		}
		else if (url.contains("logout")) {
			getLogout(req, resp);
		}
		else if (url.contains("unLogin-home")) {
			req.getRequestDispatcher("views/web/home.jsp").forward(req, resp);		
		}
		else if (url.contains("user-home")) {
			req.getRequestDispatcher("views/users/home.jsp").forward(req, resp);		
		}
		else if (url.contains("admin-home")) {
			List<Book> book = bookService.findAll();
			req.setAttribute("list", book);
			req.getRequestDispatcher("/views/admin/home.jsp").forward(req, resp);		
		}
		else  {
			HttpSession session = req.getSession();
			if (session != null && session.getAttribute("account") != null) {
				User user = (User) session.getAttribute("account");
				req.setAttribute("email", user.getEmail());
				if (user.getIs_admin() == true) {
					List<Book> book = bookService.findAll();
					req.setAttribute("list", book);
					req.getRequestDispatcher("/views/admin/home.jsp").forward(req, resp);		
				} else {					
					req.getRequestDispatcher("/views/users/home.jsp").forward(req, resp);
				}
			} 
			else {
				req.getRequestDispatcher("/views/web/home.jsp").forward(req, resp);
			}
		}
	}
	private void getLogout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.removeAttribute("account"); // remove session
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (constant.COOKIE_REMEMBER.equals(cookie.getName())) {
					cookie.setMaxAge(0); // <=> remove cookie
					resp.addCookie(cookie); // add again
					break;
				}
				resp.sendRedirect(req.getContextPath() +"/login");
			}
		}
	}
	
	private void getWaiting(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if (session != null && session.getAttribute("account") != null) {
			User user = (User) session.getAttribute("account");
			req.setAttribute("email", user.getEmail());
			if (user.getIs_admin() == true) {
				List<Book> book = bookService.findAll();
				resp.sendRedirect(req.getContextPath() + "/admin-home");
	
			} else {	
				resp.sendRedirect(req.getContextPath() + "/user-home");
//				req.getRequestDispatcher("/views/users/home.jsp").forward(req, resp);
			}
		} else {
			
			resp.sendRedirect(req.getContextPath() + "/login");
		}

	}
	private void getRegister(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/web/register.jsp");
		
	}
	private void getLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session != null && session.getAttribute("account") != null) {
			resp.sendRedirect(req.getContextPath() + "/waiting");
			return;
		}
		// Check cookie

		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("email")) {

					session = req.getSession(true);
					session.setAttribute("email", cookie.getValue());
					resp.sendRedirect(req.getContextPath() + "/waiting");
					return;
				}
			}
		}
		req.getRequestDispatcher("views/web/login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURL().toString();
		if (url.contains("register")) {
			postRegister(req,resp);
		}
		else if (url.contains("login")) {
			postLogin(req,resp);
		}
		else if (url.contains("forgotpass")) {
			postForgotPassword(req,resp);
		}
		else if (url.contains("verify")) {
			postVerify(req,resp);
		}
	}
	private void postVerify(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = resp.getWriter()){
			HttpSession session = req.getSession();
			User user = (User) session.getAttribute("account");
			String code = req.getParameter("authcode");
			if (code.equals(user.getVerifyCode())) {
				user.setEmail(user.getEmail());
				out.println("<div class=\"container\"><br/>\r\n" + "		<br/>\r\n"
				+ "		<br/>Xác thực tài khoản thành công!<br/>\r\n" + "		<br/>\r\n" + "		<br/></div>");
			}
			else {
				out.println("<div class=\"container\"><br/>\r\n" + "		<br/>\r\n"
						+ "		<br/>Sai mã kích hoạt vui lòng kiểm tra lại!<br/>\r\n" + "		<br/>\r\n" + "		<br/></div>");
			}
		}
		
	}
	private void postForgotPassword(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	private void postLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		String email = req.getParameter("email");
		String passwd = req.getParameter("passwd");
		boolean isRememberMe = false;
		String remember = req.getParameter("remember");
		if ("on".equals(remember)) {
			isRememberMe = true;
		}
		String alertMsg = "";
		if (email.isBlank() || passwd.isEmpty()) {
			alertMsg = "Tài khoản hoặc mật khẩu không đúng";
			req.setAttribute("message", alertMsg);
			req.getRequestDispatcher("views/web/login.jsp").forward(req, resp);
			return;
		}
		User user = userService.login(email, passwd);
		if (user != null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("account", user);
			if (isRememberMe) {
				saveRemeberMe(resp, email);
			}
			resp.sendRedirect(req.getContextPath() + "/waiting");
		}
	}
	private void postRegister(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String email = req.getParameter("email");
		String passwd = req.getParameter("passwd");
		String fullname = req.getParameter("fullname");
		
		String alertMsg = "";
		if (userService.checkExistUserEmail(email)) {
			alertMsg = "Email đã tồn tại!";
			req.setAttribute("error", alertMsg);
			req.getRequestDispatcher("/view/web/register.jsp").forward(req, resp);
		}
		else {
			Email sm = new Email();
			String code = sm.getRandom();
			User user = new User(email,passwd,fullname,code);
			boolean test = sm.sendEmail(user);
			if (test) {
				HttpSession session = req.getSession();
				session.setAttribute("account", user);
				boolean isSuccess = userService.register(email, passwd, fullname, code);
				if (isSuccess) {
					resp.sendRedirect(req.getContextPath() + "/VerifyCode");
					
				} 
				else {
					alertMsg = "Lỗi hệ thống!";
					req.setAttribute("error", alertMsg);
					req.getRequestDispatcher("/views/web/register.jsp").forward(req, resp);
				}
				
			}
			else {
				PrintWriter out = resp.getWriter();
				out.println("Lỗi khi gửi mail!");
			}
			
		}
	}
	private void saveRemeberMe(HttpServletResponse resp, String username) {
		Cookie cookie = new Cookie(constant.COOKIE_REMEMBER, username);
		cookie.setMaxAge(30 * 62);
		resp.addCookie(cookie);

	}
}
