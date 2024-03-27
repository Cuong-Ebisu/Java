package hcmute.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hcmute.models.EmployeeModel;
import hcmute.services.EmployeeServiceImpl;
import hcmute.services.IEmployeeService;

@WebServlet(urlPatterns = { "/index", "/ViewServlet" })
public class EmployeeController extends HttpServlet {

	private static final long serialVersionUID = 6770035997165448097L;

	IEmployeeService emplService = new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();

		if (url.contains("index")) {
			RequestDispatcher rd = req.getRequestDispatcher("/views/index.jsp");
			rd.forward(req, resp);
		}else if(url.contains("ViewServlet")) {
			String spageid = req.getParameter("page");
			int countEmple = emplService.countEmployee();
			int pageid = Integer.parseInt(spageid);
			int total = 5;
			int countPage = countEmple/total + (countEmple%total==0?0:1);
			if(pageid ==1) {}
			else {
				pageid = pageid-1;
				pageid = pageid*total +1;
			}
			List<EmployeeModel> list = emplService.getReCords(pageid, total);
			
			req.setAttribute("list", list);
			req.setAttribute("spageid", spageid);
			req.setAttribute("count", countPage);
			
			RequestDispatcher rd = req.getRequestDispatcher("/views/viewEmployee.jsp");
			rd.forward(req, resp);
		}
	}

}
