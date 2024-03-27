package vn.ltweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	private static final long serialVersionUID = -4463586421217902588L;

	@Override
	public void init() throws ServletException {
		System.out.println("Bat dau Servlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		System.out.println("Phuong thuc su dung la: " + req.getMethod());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter wr = resp.getWriter();
		wr.println("<h1>Xin chao ban<h1>");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Ket thu Servlet");
	}

}
