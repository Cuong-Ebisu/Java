package vn.ltweb;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/hello", "/xin-chao"})
public class HelloServlet2 extends HttpServlet{

	private static final long serialVersionUID = -7984252106174181210L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Phương thức sử dụng của Request: " + req.getMethod());
		req.getContentType();
		req.getContextPath();
		
		System.out.println(req.getServerName());
		System.out.println(req.getServletPath());
		
		Enumeration<String> k = req.getHeaderNames();
		while(k.hasMoreElements())
		{
			String key = k.nextElement();
			System.out.println(key + ":" + req.getHeader(key));
		}
	}
}
