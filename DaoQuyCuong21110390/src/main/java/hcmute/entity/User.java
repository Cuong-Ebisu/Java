package hcmute.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @Column(name = "Username")
    private String username;
    
    @Column(name = "Password")
    private String password;
    
    @Column(name = "Phone")
    private String phone;
    
    @Column(name = "Fullname")
    private String fullname;
    
    @Column(name = "Email")
    private String email;
    
    @Column(name = "Admin")
    private boolean admin;
    
    @Column(name = "Active")
    private boolean active;
    
    @Column(name = "Images")
    private String images;

	public User() {
		super();
	}

	public User(String username, String password, String phone, String fullname, String email, boolean admin,
			boolean active, String images) {
		super();
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.fullname = fullname;
		this.email = email;
		this.admin = admin;
		this.active = active;
		this.images = images;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}
    
    
}
