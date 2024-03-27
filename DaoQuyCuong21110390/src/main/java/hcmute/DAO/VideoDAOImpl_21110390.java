package hcmute.DAO;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.TypedQuery;

import JPAConfig.JPAConfig;
import hcmute.entity.Video;


public class VideoDAOImpl_21110390 implements IVideoDAO_21110390 {

	
	@Override
	public List<Video> findVideoByCategory(int categoryId) {
		EntityManager entityManager = JPAConfig.getEntityManager();
		String jpql = "SELECT v FROM Video v JOIN FETCH v.category c WHERE c.categoryId = :categoryId";
        TypedQuery<Video> query = entityManager.createQuery(jpql, Video.class);
        query.setParameter("categoryId", categoryId);
        return query.getResultList();
	}

	@Override
	public List<Video> findVideoByCategoryDESC() {
		EntityManager em = JPAConfig.getEntityManager();
	    
	    try {
	        String jpql = "SELECT v FROM Video v ORDER BY v.likedCount DESC";
	        TypedQuery<Video> query = em.createQuery(jpql, Video.class);
	        return query.getResultList();
	    } finally {
	        em.close();
	    }
	}

	@Override
	public List<Video> findVideosOrderByLikesDesc() {
		EntityManager entityManager = JPAConfig.getEntityManager();
		String jpql = "SELECT f.video, COUNT(f) as likeCount FROM Favorite f GROUP BY f.video.videoId ORDER BY likeCount DESC";
	    TypedQuery<Object[]> query = entityManager.createQuery(jpql, Object[].class);
	    List<Object[]> results = query.getResultList();

	    List<Video> videos = new ArrayList<>();
	    for (Object[] result : results) {
	        Video video = (Video) result[0];
	        videos.add(video);
	    }

	    return videos;
	}



}
