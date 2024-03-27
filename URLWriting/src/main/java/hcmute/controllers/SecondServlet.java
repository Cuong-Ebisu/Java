package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/servlet2"})
public class SecondServlet extends HttpServlet{

	private static final long serialVersionUID = -2137256394520748100L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			//getting value from the quey string
			String n = req.getParameter("uname");
			out.print("Hello"+ n);
			
			out.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
