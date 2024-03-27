package hcmute.models;

import java.io.Serializable;

public class UserModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String password;
	public UserModel() {
		super();
	}
	public UserModel(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
}
