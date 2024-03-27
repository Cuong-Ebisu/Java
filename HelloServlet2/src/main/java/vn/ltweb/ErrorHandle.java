package vn.ltweb;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/error"})
public class ErrorHandle extends HttpServlet{

	

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter printWriter = resp.getWriter();
		String name = "Xảy ra lỗi, trang không tồn tại";
		printWriter.println(name);
		
		/*Throwable throwable = (Throwable)req.getAttribute("javax.servlet.error.exception");
		Integer statusCode = (Integer)req.getAttribute("javax.servlet.error.status_code");
		String servletName = (String)req.getAttribute("javax.servlet.error.servlet_name");
		
		if(servletName == null) {
			servletName = "Unknown";
			
		}
		String requestUri = (String)req.getAttribute("javax.servlet.error.request_uri");
		
		if(requestUri == null)
		{
			requestUri = "Unknown";
		}
		
		
		if(statusCode == 404) {
			resp.sendRedirect("/HelloServlet/loi404.jsp");
		}
		
		else if(statusCode == 500)
		{
			RequestDispatcher rd = req.getRequestDispatcher("/HelloServlet/loi500.jsp");
			rd.forward(req, resp);
		}
		else {
			
		}*/
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
}
