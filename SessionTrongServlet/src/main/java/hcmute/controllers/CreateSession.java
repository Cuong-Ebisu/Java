package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/createSession")
public class CreateSession extends  HttpServlet{

	private static final long serialVersionUID = -4642057810515729161L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Khởi tạo session
		HttpSession s = req.getSession();
		//Gán dữ liệu vào session
		s.setAttribute("ten", "Đào Quý Cường");
		s.setAttribute("tuoi", new Integer(40));
		//Thiết lập thời gian tồn tại session
		s.setMaxInactiveInterval(30);
		//Hiển thị thông báo lên web
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("Xin chào bạn session đã được tạo");
		out.close();
	}
}
