package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/helloform"})
public class GetUseURL extends HttpServlet{
	
	private static final long serialVersionUID = -8181298697083612231L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//nhan du lieu tu request url
		String ten = req.getParameter("ten");
		String holot = req.getParameter("holot");
		
		//hien thi du lieu ra web bang doi tuong PrintWriter
		PrintWriter out = resp.getWriter();
		out.println("<b>First Name</b>: " + ten + "<br/><b>Last Name</b>:" + holot);
	}

}
