package hcmute.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Favorites")

public class Favorite implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FavoriteId")
    private int favoriteId;
    
    @Column(name = "LikedDate")
    private Date likedDate;
    
    @ManyToOne
    @JoinColumn(name = "VideoId")
    private Video video;
    
    @ManyToOne
    @JoinColumn(name = "Username")
    private User user;

	public Favorite() {
		super();
	}

	public Favorite(int favoriteId, Date likedDate, Video video, User user) {
		super();
		this.favoriteId = favoriteId;
		this.likedDate = likedDate;
		this.video = video;
		this.user = user;
	}

	public int getFavoriteId() {
		return favoriteId;
	}

	public void setFavoriteId(int favoriteId) {
		this.favoriteId = favoriteId;
	}

	public Date getLikedDate() {
		return likedDate;
	}

	public void setLikedDate(Date likedDate) {
		this.likedDate = likedDate;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
}
