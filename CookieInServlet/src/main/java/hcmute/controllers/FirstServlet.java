package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/servlet1"})
public class FirstServlet extends HttpServlet{

	private static final long serialVersionUID = 2708076958771603168L;


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			String n = req.getParameter("userName");
			out.print("Welcome" + n);
			Cookie ck = new Cookie("uname", n);//creating cookie object
			resp.addCookie(ck);//adding cookie in the response
			
			//creating submit button
			out.print("<form action = 'servlet2' method = 'post'>");
			out.print("<input type = 'submit' value = 'go'>");
			out.print("</form>");
			
			out.close();
		}catch(Exception e) {System.out.println(e);}
		
	}
}
