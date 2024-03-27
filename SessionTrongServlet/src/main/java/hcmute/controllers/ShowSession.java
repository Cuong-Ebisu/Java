package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/showSession"})
public class ShowSession extends HttpServlet{

	private static final long serialVersionUID = -4957338672551140161L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Hiển thị session lên web
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		String ten = "";
		//Khởi tạo session
		HttpSession s = req.getSession();
		Object obj = s.getAttribute("ten"); //truy xuất dữ liệu từ session
		//kiểm tra đối tượng Object có null không
		if(obj != null) {
			ten  = String.valueOf(obj); //ép kiểu về String
		}else {
			resp.sendRedirect("/SessionTrongServlet/createsession");//Nếu null thì chuyển về trang tạo session
		}
		int tuoi = (Integer)s.getAttribute("tuoi");//ép kiểu
		//Hiển thị session lên web
		out.println("Xin chào bạn: " + ten + " tuổi: " + tuoi);
		out.close();
	}
}
