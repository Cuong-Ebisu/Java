package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/servlet1"})
public class FirstServlet extends HttpServlet{

	private static final long serialVersionUID = -3782496033097769533L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			String n = req.getParameter("userName");
			out.print("Welcome"+n);
			
			//appending the username in the query string
			out.print("<a href = 'servlet2'?uname ="+n+">visit</a>");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
