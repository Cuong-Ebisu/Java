package hcmute.models;

import java.io.Serializable;

public class UserModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String uname;
	private String upwd;
	private String uemail;
	private String umobile;
	public UserModel() {
		super();
	}
	public UserModel(String uname, String upwd, String uemail, String umobile) {
		super();
		this.uname = uname;
		this.upwd = upwd;
		this.uemail = uemail;
		this.umobile = umobile;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUmobile() {
		return umobile;
	}
	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}
	@Override
	public String toString() {
		return "UserModel [uname=" + uname + ", upwd=" + upwd + ", uemail=" + uemail + ", umobile=" + umobile + "]";
	}
	
}
