package Model;

public class VideoModel_20133069 {
	private int VideoId;
	private String Title;
	private String Poster;
	private int Views;
	private String Description;
	private int Active;
	private int CategoryId;
	
	public VideoModel_20133069() {
		super();
	}
	
	public VideoModel_20133069(int videoId, String title, String poster, int views, String description, int active,
			int categoryId) {
		super();
		VideoId = videoId;
		Title = title;
		Poster = poster;
		Views = views;
		Description = description;
		Active = active;
		CategoryId = categoryId;
	}

	public int getVideoId() {
		return VideoId;
	}
	public void setVideoId(int videoId) {
		VideoId = videoId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getPoster() {
		return Poster;
	}
	public void setPoster(String poster) {
		Poster = poster;
	}
	public int getViews() {
		return Views;
	}
	public void setViews(int views) {
		Views = views;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getActive() {
		return Active;
	}
	public void setActive(int active) {
		Active = active;
	}
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	
}
