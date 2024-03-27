package hcmute.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 6389490774339189924L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		//Lấy dữ liệu từ tham số của form
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
		if(user.equals("cuong") && pass.equals("123")) {
			//Khởi động tạo cookie
			Cookie cookie = new Cookie("username", user);
			//Thiết lập thời gian tồn tại 30s của cookie
			cookie.setMaxAge(30);
			//Thêm cookie vào response
			resp.addCookie(cookie);
			//Chuyển sang trang HelloServlet
			resp.sendRedirect("/LoginBangCookie/hello");
		}else {
			resp.sendRedirect("/LoginBangCookie/login");
		}
			
	}
}
