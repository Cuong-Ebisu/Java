package vn.ltweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/check-config" }, initParams = { @WebInitParam(name = "name", value = "Đào Quý Cường"),
		@WebInitParam(name = "email", value = "cuongdq"), @WebInitParam (name = "sdt", value = "0243839859") })
public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = -9098616802276475023L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset = UTF-8");

		PrintWriter out = resp.getWriter();
		
		ServletConfig sc = getServletConfig();
		
		out.println(sc.getInitParameter("email"));
		out.println(sc.getInitParameter("name"));
		
		//Thiết lập tham số chung cho web
		getServletContext().setAttribute("truong", "Trường đại học sư phạm kỹ thuật HCM");;
		
		//Gọi tham số chung cho web
		String truong = (String) getServletContext().getAttribute("truong");
		
		out.println(truong);
		String scon = getServletConfig().getInitParameter("sdt");
		out.println(scon);
		out.close();
	}
}
