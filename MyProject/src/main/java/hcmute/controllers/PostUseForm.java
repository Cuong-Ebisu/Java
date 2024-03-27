package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/helloform2"})
public class PostUseForm extends HttpServlet{
	

	private static final long serialVersionUID = 2843429851220283178L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//Set response content type
		resp.setContentType("text/html");
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		//Nhan du lieu tu request URL
		String ten = req.getParameter("ten");
		String holot = req.getParameter("holot");
		
		//Hien thi du lieu ra web bang doi tuong PrintWriter
		PrintWriter out = resp.getWriter();
		out.println("<b>First Name</b>: " + ten + "<br/><b>Last Name</b>: " + holot);
	}

}
