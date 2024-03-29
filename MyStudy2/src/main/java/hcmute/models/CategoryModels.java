package hcmute.models;

import java.io.Serializable;

public class CategoryModels implements Serializable{

	private static final long serialVersionUID = 8257958130728069397L;
	
	private int cateID;
	private String cateName;
	private String image;
	public CategoryModels() {
		super();
	}
	public CategoryModels(int cateID, String cateName, String image) {
		super();
		this.cateID = cateID;
		this.cateName = cateName;
		this.image = image;
	}
	public int getCateID() {
		return cateID;
	}
	public void setCateID(int cateID) {
		this.cateID = cateID;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "CategoryModels [cateID=" + cateID + ", cateName=" + cateName + ", image=" + image + "]";
	}
	
	

}
