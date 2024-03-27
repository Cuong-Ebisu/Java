package hcmute.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Shares")
public class Share implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ShareId")
    private int shareId;
    
    @Column(name = "Emails")
    private String emails;
    
    @Column(name = "ShareDate")
    private Date shareDate;
    
    @ManyToOne
    @JoinColumn(name = "Username")
    private User user;
    
    @ManyToOne
    @JoinColumn(name = "VideoId")
    private Video video;

	public Share() {
		super();
	}

	public Share(int shareId, String emails, Date shareDate, User user, Video video) {
		super();
		this.shareId = shareId;
		this.emails = emails;
		this.shareDate = shareDate;
		this.user = user;
		this.video = video;
	}

	public int getShareId() {
		return shareId;
	}

	public void setShareId(int shareId) {
		this.shareId = shareId;
	}

	public String getEmails() {
		return emails;
	}

	public void setEmails(String emails) {
		this.emails = emails;
	}

	public Date getShareDate() {
		return shareDate;
	}

	public void setShareDate(Date shareDate) {
		this.shareDate = shareDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}
    
    
}
