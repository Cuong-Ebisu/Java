package hcmute.services;

import java.util.List;

import hcmute.DAO.IVideoDAO_21110390;
import hcmute.DAO.VideoDAOImpl_21110390;
import hcmute.entity.Video;

public class VideoServiceImpl_21110390 implements IVideoService_21110390{

	IVideoDAO_21110390 videoDAO = new VideoDAOImpl_21110390();
	@Override
	public List<Video> findVideoByCategory(int cateid) {
		return videoDAO.findVideoByCategory(cateid);
	}
	@Override
	public List<Video> findVideoByCategoryDESC() {
		return videoDAO.findVideoByCategoryDESC();
	}
	@Override
	public List<Video> findVideosOrderByLikesDesc() {
		return videoDAO.findVideosOrderByLikesDesc();
	}

}
