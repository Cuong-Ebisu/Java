package hcmute.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query = "select u from User u")
public class User implements Serializable {

	private static final long serialVersionUID = -5196428437464696863L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String email;
	private String fullname;
	private int phone;
	private String passwd;
	private LocalDateTime  signup_date;
	private LocalDateTime  last_login;
	private boolean is_admin;
	@Transient
	private String verifyCode;
	
	@ManyToMany
	@JoinTable(
	    name = "rating", // Tên bảng trung gian
	    joinColumns = @JoinColumn(name = "id"), // Cột khóa ngoại của User
	    inverseJoinColumns = @JoinColumn(name = "bookid") // Cột khóa ngoại của Book
	)
	private List<Book> books;

	public User(String email, String passwd,String fullname, String verifyCode) {
		super();
		this.email = email;
		this.fullname = fullname;
		this.passwd = passwd;
		this.verifyCode = verifyCode;
	}
	@OneToMany(mappedBy = "user")
	private List<Rating> ratings;


	public User() {
		super();
	}
	
	public User(int id, String email, String fullname, int phone, String passwd, LocalDateTime signup_date,
			LocalDateTime last_login, boolean is_admin) {
		super();
		this.id = id;
		this.email = email;
		this.fullname = fullname;
		this.phone = phone;
		this.passwd = passwd;
		this.signup_date = signup_date;
		this.last_login = last_login;
		this.is_admin = is_admin;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public LocalDateTime getSignup_date() {
		return signup_date;
	}
	public void setSignup_date(LocalDateTime signup_date) {
		this.signup_date = signup_date;
	}
	public LocalDateTime getLast_login() {
		return last_login;
	}
	public void setLast_login(LocalDateTime last_login) {
		this.last_login = last_login;
	}
	public boolean getIs_admin() {
		return is_admin;
	}
	public void setIs_admin(boolean is_admin) {
		this.is_admin = is_admin;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
