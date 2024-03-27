package hcmute.models;

import java.io.Serializable;

public class ProductModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private int ProductID;
	private String ProductName;
	 
	private String Description;
	private int Price;
	private String imageLink;
	private int CategoryID;
	private int SellerID;
	private int Amount;
	private int stoke;
	
	private CategoryModels category;
	
	public ProductModel() {
		super();
	}
	
	
	
	public ProductModel(int productID, String productName, String description, int price, String imageLink,
			int categoryID, int sellerID, int amount, int stoke, CategoryModels category) {
		super();
		this.ProductID = productID;
		this.ProductName = productName;
		this.Description = description;
		this.Price = price;
		this.imageLink = imageLink;
		this.CategoryID = categoryID;
		this.SellerID = sellerID;
		this.Amount = amount;
		this.stoke = stoke;
		this.category = category;
	}



	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int productID) {
		this.ProductID = productID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		this.ProductName = productName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		this.Price = price;
	}
	public String getImageLink() {
		return imageLink;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	public int getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(int categoryID) {
		this.CategoryID = categoryID;
	}
	public int getSellerID() {
		return SellerID;
	}
	public void setSellerID(int sellerID) {
		this.SellerID = sellerID;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		this.Amount = amount;
	}
	public int getStoke() {
		return stoke;
	}
	public void setStoke(int stoke) {
		this.stoke = stoke;
	}
	
	
	public CategoryModels getCategory() {
		return category;
	}



	public void setCategory(CategoryModels category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "ProductModel [ProductID=" + ProductID + ", ProductName=" + ProductName + ", Description=" + Description
				+ ", Price=" + Price + ", imageLink=" + imageLink + ", CategoryID=" + CategoryID + ", SellerID="
				+ SellerID + ", Amount=" + Amount + ", stoke=" + stoke + "]";
	}
	
	
}
