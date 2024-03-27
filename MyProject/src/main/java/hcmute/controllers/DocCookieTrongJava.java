package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/docCookie"})
public class DocCookieTrongJava extends HttpServlet{

	private static final long serialVersionUID = 7732447018350961630L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = null;
		Cookie[] cookies = null;
		
		//Get an array of Cookies associated with this domain
		cookies = req.getCookies();
		//Set response content type
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		if(cookies != null)
		{
			out.println("<h2> Found Cookies Name and Value</h2>");
			for(int i = 0; i< cookies.length; i++) {
				cookie = cookies[i];
				out.print("Name: " + cookie.getName() + ", ");
				out.print("Value: " + cookie.getValue() + " <br/>");
			}
		}else {
			out.println("<h2>No coolies founds</h2>");
		}
		out.close();
	}
}
