package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/cookie"})
public class CookieTrongJava extends HttpServlet{

	private static final long serialVersionUID = -7676859006434085985L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Nhận dữ liệu từ FORM
		String ten = req.getParameter("ten");
		String holot = req.getParameter("holot");
		
		//Create cookies for first and last names
		Cookie firstName = new Cookie("ten", ten);
		Cookie lastName = new Cookie("holot", holot);
		
		//Set expiry date after 24 HRS for both the cookies.
		
		firstName.setMaxAge(60*60*24);
		lastName.setMaxAge(60*60*24);
		
		//Add both the cookies in the response header
		resp.addCookie(firstName);
		resp.addCookie(lastName);
		
		PrintWriter out = resp.getWriter();
		out.println("<b>First Name</b>: " + firstName.getValue() + " -<b>Last Name</b>: " + lastName.getValue());
	}
}
