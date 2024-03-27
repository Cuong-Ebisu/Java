package hcmute.services;

import java.util.List;

import hcmute.entity.Video;

public interface IVideoService_21110390 {
	List<Video> findVideoByCategory(int cateid);
	List<Video> findVideoByCategoryDESC();
	List<Video> findVideosOrderByLikesDesc();
}
