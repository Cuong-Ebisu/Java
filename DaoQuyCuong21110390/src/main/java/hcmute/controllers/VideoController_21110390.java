package hcmute.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hcmute.entity.Video;
import hcmute.services.IVideoService_21110390;
import hcmute.services.VideoServiceImpl_21110390;

@WebServlet(urlPatterns = { "/findvideo", "/listVideoLike" })
public class VideoController_21110390 extends HttpServlet {

	private static final long serialVersionUID = -2283500752624201418L;

	IVideoService_21110390 videoService = new VideoServiceImpl_21110390();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI().toString();
		if (url.contains("findvideo")) {
			int id = Integer.parseInt(req.getParameter("cateid"));

			List<Video> videos = videoService.findVideoByCategory(id);
			req.setAttribute("videos", videos);

			RequestDispatcher rd = req.getRequestDispatcher("/views/viewVideo_21110390.jsp");
			rd.forward(req, resp);
		}
		if (url.contains("listVideoLike")) {
			List<Video> favoriteVideos = videoService.findVideosOrderByLikesDesc();
			req.setAttribute("videosByLikes", favoriteVideos);

			RequestDispatcher rd = req.getRequestDispatcher("/views/viewVideoLiked_21110390.jsp");
			rd.forward(req, resp);
		}
	}
}
