package vn.ltweb.controllers;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/hello", "/hi"})
public class HelloWorld extends HttpServlet {

	private static final long serialVersionUID = -8558382322345001179L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Step 1: Nhận request
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("ten");
		String y = req.getParameter("nam");

		// Step 2: Xử lý Request
		String namey = name + " " + y;

		// Step 3: Trả response
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		out.println(namey);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Step 1: Nhận request

		// Step 2: Xử lý Request

		// Step 3: Trả response
	}


}
