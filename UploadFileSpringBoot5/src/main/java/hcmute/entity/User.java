package hcmute.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "app_user") 
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id") // Thay vì 'UserID', sử dụng 'user_id'
    private Long userId;

    @Column(name = "username", columnDefinition = "varchar(255)")
    private String username;

    @Column(name = "password", columnDefinition = "varchar(255)")
    private String password;

    @Column(name = "email", columnDefinition = "varchar(255)")
    private String email;

    @Column(name = "avatar_url", columnDefinition = "varchar(255)") // Thay vì 'AvatarURL', sử dụng 'avatar_url'
    private String avatarUrl;

    @Column(name = "full_name", columnDefinition = "nvarchar(255)") // Thay vì 'FullName', sử dụng 'full_name'
    private String fullName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "gender", columnDefinition = "nvarchar(255)")
    private String gender;

    @Column(name = "bio", columnDefinition = "nvarchar(255)")
    private String bio;

    @Column(name = "phone_number", columnDefinition = "varchar(255)") // Thay vì 'PhoneNumber', sử dụng 'phone_number'
    private String phoneNumber;

    @Column(name = "address", columnDefinition = "nvarchar(255)")
    private String address;

    @Column(name = "relationship_status", columnDefinition = "nvarchar(255)") // Thay vì 'RelationshipStatus', sử dụng 'relationship_status'
    private String relationshipStatus;

    @Column(name = "job", columnDefinition = "nvarchar(255)")
    private String job;

    @Column(name = "education", columnDefinition = "nvarchar(255)")
    private String education;

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;

    @JsonIgnore
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Post> posts;

    @JsonIgnore
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Like> likes;

    @JsonIgnore
    @OneToMany(mappedBy = "sender", fetch = FetchType.EAGER)
    private List<Message> sentMessages;

    @JsonIgnore
    @OneToMany(mappedBy = "receiver", fetch = FetchType.EAGER)
    private List<Message> receivedMessages;

    @JsonIgnore
    @OneToMany(mappedBy = "user1", fetch = FetchType.EAGER)
    private List<Friendship> friendships1;

    @JsonIgnore
    @OneToMany(mappedBy = "user2", fetch = FetchType.EAGER)
    private List<Friendship> friendships2;

    @JsonIgnore
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<EventParticipant> eventParticipants;

    @JsonIgnore
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Comment> comments;
}
