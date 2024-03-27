package hcmute.ALOHCMUTE.services;

import java.util.List;

import hcmute.ALOHCMUTE.entity.Likes;
import hcmute.ALOHCMUTE.entity.Post;
import hcmute.ALOHCMUTE.entity.User;

public interface ILikeService {

	int countLikesByPostId(Post postid);

	int countLikesByUserId(User userid);

	List<Post> topLike();

	void delLike(Long userid, Long postid);

	void deleteLike(User userid, Post postid);

	boolean existsByUserIdAndPostId(User userid, Post postid);

	void insertLike(User userid, Post postid);

	<S extends Likes> S save(S entity);

}
