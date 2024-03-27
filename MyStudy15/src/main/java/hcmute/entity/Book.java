package hcmute.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

//Chú thích rằng xác định rằng class là một entiry, và JPA sẽ quản lý nó
@Entity
//Chú thích này xác định tên của bảng cơ sở dữ liệu tương ứng với entity "Book"
@Table(name="Books")
//Chú thích này xác định một câu truy vấn có tên "Book.findAll" mà bạn có thể sử dụng để truy vấn dữ liệu entity "Book"
@NamedQuery(name="Book.findAll", query = "select b from Book b")
public class Book implements Serializable{
	private static final long serialVersionUID = 6781841840232093775L;
	@Id
	//Xác định bookid là khóa chính
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//tự động tạo giá trị cho trường này
	private int bookid;
	private int isbn;
	private String title;
	private String publisher;
	private BigDecimal price;
	private String description;
	private Date publish_date;
	private String cover_image;
	private int quantity;
	@Transient
	private double avgRating;
	public double getAvgRating() {
		return avgRating;
	}


	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "book_author",
        joinColumns = @JoinColumn(name = "bookid"),
        inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private List<Author> authors;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
	    name = "rating", // Tên bảng trung gian
	    joinColumns = @JoinColumn(name = "bookid"), // Cột khóa ngoại của Book
	    inverseJoinColumns = @JoinColumn(name = "id") // Cột khóa ngoại của User
	)
	private List<User> users;
	@OneToMany(mappedBy = "book")
	private List<Rating> ratings;
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}



	public List<Author> getAuthors() {
		return authors;
	}



	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}



	public List<User> getUsers() {
		return users;
	}



	public void setUsers(List<User> users) {
		this.users = users;
	}



	
	public Book(int bookid, int isbn, String title, String publisher, BigDecimal price, String description,
			Date publish_date, String cover_image, int quantity) {
		super();
		this.bookid = bookid;
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
		this.price = price;
		this.description = description;
		this.publish_date = publish_date;
		this.cover_image = cover_image;
		this.quantity = quantity;
	}



	public int getBookid() {
		return bookid;
	}



	public void setBookid(int bookid) {
		this.bookid = bookid;
	}



	public int getIsbn() {
		return isbn;
	}



	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public BigDecimal getPrice() {
		return price;
	}



	public void setPrice(BigDecimal price) {
		this.price = price;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Date getPublish_date() {
		return publish_date;
	}



	public void setPublish_date(java.sql.Date publish_date) {
		this.publish_date = publish_date;
	}



	public String getCover_image() {
		return cover_image;
	}



	public void setCover_image(String cover_image) {
		this.cover_image = cover_image;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public Book() {
		super();
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
