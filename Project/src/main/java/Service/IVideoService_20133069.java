package Service;

import java.util.List;

import Model.VideoModel_20133069;

public interface IVideoService_20133069 {
	void insert(VideoModel_20133069 video);
	void edit(VideoModel_20133069 video);
	void delete(int id);
	List<VideoModel_20133069> getAll();
	VideoModel_20133069 get(int id);
	VideoModel_20133069 get(String name);
	List<VideoModel_20133069> pagingVideo(int index);
}
