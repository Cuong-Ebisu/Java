package Controller.Admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.VideoModel_20133069;
import Service.IVideoService_20133069;
import Service.Impl.VideoServiceImpl_20133069;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = {"/admin/video/list"})
public class VideoListController_20133069 extends HttpServlet {
	IVideoService_20133069 videoService = new VideoServiceImpl_20133069();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String indexPage = req.getParameter("index");
		
		List<VideoModel_20133069> listvideo  = videoService.getAll();
		
		if (indexPage == null) {
			indexPage = "1";
		}
		int index = Integer.parseInt(indexPage);
		int count = listvideo.size();
		int endPage = count/6;
		if (count % 6 != 0) {
			endPage ++;
		}
		
		listvideo = videoService.pagingVideo(index);
		
		req.setAttribute("listvideo", listvideo);
		req.setAttribute("tag", indexPage);
		req.setAttribute("endP", endPage);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/views/admin/list-video.jsp");
		dispatcher.forward(req, resp);
	}
	
}
