package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/CheckBoxAction" })
public class CheckBoxAction extends HttpServlet {

	private static final long serialVersionUID = 1308773971031192116L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Set response content type
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String title = "Doc du lieu tu CheckBox trong Servlet";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + 
				"transitional//en\">\n";;
		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
				+ "<body bgcolor = \"#f0f0f0\">\n" + "<h1 align = \"center\">" + title + "</h1>\n" + "<ul>\n"
				+ " <li><b>Toan : </b>: " + req.getParameter("toan") + "\n" + " <li><b>Vat Ly: </b>: "
				+ req.getParameter("ly") + "\n" + " <li><b>Hoa Hoc: </b>: " + req.getParameter("hoa") + "\n"
				+ "</ul>\n" + "</body>" + "</html>");
	}
}
