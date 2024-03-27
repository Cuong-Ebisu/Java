package Service.Impl;

import java.util.List;

import DAO.IVideoDAO_20133069;
import DAO.Impl.VideoDAOImpl_20133069;
import Model.VideoModel_20133069;
import Service.IVideoService_20133069;

public class VideoServiceImpl_20133069 implements IVideoService_20133069 {
	IVideoDAO_20133069 videoDAO = new VideoDAOImpl_20133069();
	@Override
	public void insert(VideoModel_20133069 video) {
		videoDAO.insert(video);
	}

	@Override
	public void edit(VideoModel_20133069 video) {
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<VideoModel_20133069> getAll() {
		return videoDAO.getAll();	
	}

	@Override
	public VideoModel_20133069 get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VideoModel_20133069 get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VideoModel_20133069> pagingVideo(int index) {
		return videoDAO.pagingVideo(index);
	}

}
