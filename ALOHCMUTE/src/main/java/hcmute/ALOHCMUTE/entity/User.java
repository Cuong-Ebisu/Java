package hcmute.ALOHCMUTE.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(name = "username", columnDefinition = "varchar(255)")
	private String username;
	
	@Column(name = "password", columnDefinition = "varchar(255)")
	private String password;

	@Column(name = "email", columnDefinition = "varchar(255)")
	private String email;

	@Column(name = "avatar", columnDefinition = "varchar(255)")
	private String avatar;

	@Column(name = "full_name", columnDefinition = "nvarchar(255)")
	private String fullName;

	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;

	@Column(name = "gender", columnDefinition = "nvarchar(255)")
	private String gender;

	@Column(name = "bio", columnDefinition = "nvarchar(255)")
	private String bio;

	@Column(name = "phone_number", columnDefinition = "varchar(255)")
	private String phoneNumber;

	@Column(name = "address", columnDefinition = "nvarchar(255)")
	private String address;

	@Column(name = "relationship_status", columnDefinition = "nvarchar(255)")
	private String relationshipStatus;

	@Column(name = "job", columnDefinition = "nvarchar(255)")
	private String job;

	@Column(name = "education", columnDefinition = "nvarchar(255)")
	private String education;

	
	
	@JsonIgnore
	@OneToMany(mappedBy = "userid", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Post> postid;
	
	@JsonIgnore
	@OneToMany(mappedBy = "userid", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Likes> likes;

	@Override
	public String toString() {
		return "" + userId + "";
	}
}
