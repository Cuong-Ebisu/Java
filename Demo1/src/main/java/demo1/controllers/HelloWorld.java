package demo1.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/hello","/xin-chao"})
public class HelloWorld extends HttpServlet{


	private static final long serialVersionUID = -320172185855127024L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Step1: Nhan request tu client or api
		resp.setCharacterEncoding("utf-8");
		String name = req.getParameter("ten");
		String y = req.getParameter("nam");
		
		//Step2: Xu ly request
		String namey = name + " " +y;
		
		//Step3: Response
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.printf(namey);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Step1: Nhan request tu client or api
		
		
		//Step2: Xu ly request
		
		
		//Step3: Response
		
	}

}