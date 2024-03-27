package hcmute.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class Category implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID")
    private int cateID;

    @Column(name = "CategoryName")
    private String cateName;

    @Column(name = "icon")
    private String images;

	public Category() {
		super();
	}

	public Category(int cateID, String cateName, String images) {
		super();
		this.cateID = cateID;
		this.cateName = cateName;
		this.images = images;
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

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "Category [cateID=" + cateID + ", cateName=" + cateName + ", images=" + images + "]";
	}
    
}
