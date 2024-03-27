package hcmute.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/ReadParamsAction" })
public class ReadParamsAction extends HttpServlet {

	private static final long serialVersionUID = 4638138808152915199L;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Set response content type
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String title = "Reading All Form Parameters";
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 "
				+ "transitional//en\">\n";
		out.println(docType +
				"<html>\n" +
				"<head><title>" + title + "</title></head>\n" +
				"<body bgcolor = \"#f0f0f0\">\n" +
				"<h1 align = \"center\">" + title + "</h1>\n" +
				"<table width = \"100%\" border = \"1\" align = \"center\">\n" +
				"<tr bgcolor = \"#949494\">\n" +
					"<th>Param Name</th>" +
					"<th>Param Value(s)</th>\n"+
				"</tr>\n"
				);
		// get all parameters of form
		@SuppressWarnings("rawtypes")
		Enumeration paramNames = req.getParameterNames();
		
		//read parameters
		while(paramNames.hasMoreElements()) {
			String paramName = (String)paramNames.nextElement();
			out.print("<tr><td>" + paramName + "</td>\n<td>");
			String[] paramValues = req.getParameterValues(paramName);
			
			//Read single valued data
			if(paramValues.length == 1) {
				String paramValue = paramValues[0];
				if(paramValue.length() == 0)
					out.println("<i>No Value</i>");
				else
					out.println(paramValue);
				
			}else {
				//Read multiple valued data
				out.println("<ul>");
				for(int i = 0; i< paramValues.length; i++) {
					out.println("<li>" + paramValues[i]);
				}
				out.println("</tr>\n</table>\n<\body></html>");
			} 
		}
		out.println("<tr>\n</table>\n</body></html>");
	}

}
