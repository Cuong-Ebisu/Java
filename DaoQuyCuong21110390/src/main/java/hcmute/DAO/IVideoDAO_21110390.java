package hcmute.DAO;

import java.util.List;

import hcmute.entity.Video;


public interface IVideoDAO_21110390 {
	List<Video> findVideoByCategory(int categoryId);
	List<Video> findVideoByCategoryDESC();
	List<Video> findVideosOrderByLikesDesc();
}
