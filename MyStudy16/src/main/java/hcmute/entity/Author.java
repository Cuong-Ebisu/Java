package hcmute.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
//Tên bảng cơ sở dữ liệu tương ứng với entity Author
@Table(name="Author")
//Xác định một câu truy vấn với tên "Author.findAll" mà bạn có thể sử dụng để truy vấn dữ liệu từ entity "Author"
@NamedQuery(name="Author.findAll", query = "select a from Author a")
public class Author implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Author id là khóa chính
	private int author_id;
	private String author_name;
	private Date date_of_birth;
	@ManyToMany(mappedBy = "authors")
    private List<Book> books;


	public List<Book> getBooks() {
		return books;
	}



	public void setBooks(List<Book> books) {
		this.books = books;
	}



	public int getAuthor_id() {
		return author_id;
	}



	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}



	public String getAuthor_name() {
		return author_name;
	}



	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}



	public Date getDate_of_birth() {
		return date_of_birth;
	}



	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}



	public Author(int author_id, String author_name, Date date_of_birth) {
		super();
		this.author_id = author_id;
		this.author_name = author_name;
		this.date_of_birth = date_of_birth;
	}



	public Author() {
		super();
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
