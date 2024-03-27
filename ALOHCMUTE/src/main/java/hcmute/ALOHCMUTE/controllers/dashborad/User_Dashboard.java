package hcmute.ALOHCMUTE.controllers.dashborad;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hcmute.ALOHCMUTE.entity.Post;
import hcmute.ALOHCMUTE.entity.User;
import hcmute.ALOHCMUTE.services.ICommentService;
import hcmute.ALOHCMUTE.services.ILikeService;
import hcmute.ALOHCMUTE.services.IPostService;
import hcmute.ALOHCMUTE.services.IUserService;

@Controller
@RequestMapping("user/dashboard")
public class User_Dashboard {
	@Autowired
	ICommentService commentService;
	
	@Autowired
	ILikeService likeService;
	
	@Autowired
	IPostService postService;
	
	@Autowired
	IUserService userService;
	
	@GetMapping("{userid}")
	public String list(ModelMap model,@RequestParam("userid") Long userid) {
		User user = userService.getCurrentUserById(userid);
		model.addAttribute("user", user);
		
		int numPost = postService.countPostByUserId(user);
		model.addAttribute("numPost", numPost);
		
		int numLike = likeService.countLikesByUserId(user);
		model.addAttribute("numLike", numLike);
		
		List<Post> posts = postService.findAllPostByUserId(user);
		model.addAttribute("posts", posts);
		
		Map<Post, Integer> commentCountMap = new HashMap<>();
		Map<Post, Integer> likeCountMap = new HashMap<>();
		 for (Post post : posts) {
		       
		      int numberCmt = commentService.countCommentsByPostId(post);
		      commentCountMap.put(post, numberCmt);
		      
		      int numberLike = likeService.countLikesByPostId(post);
		      likeCountMap.put(post, numberLike);
		 }
		 
		model.addAttribute("cmtcount", commentCountMap);
		model.addAttribute("likecount", likeCountMap);
		return "user/dashboard/DashBoard";
	}
	
	
	
	
}