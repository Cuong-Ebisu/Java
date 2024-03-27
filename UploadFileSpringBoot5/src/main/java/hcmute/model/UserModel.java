package hcmute.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import lombok.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
	private Long userId;

    @NotEmpty
    @Length(min = 5)
    private String username;

    @NotEmpty
    @Length(min = 5)
    private String password;

    @Email
    @NotEmpty
    private String email;

    private String avatarUrl;

    @NotEmpty
    private String fullName;

    private LocalDate dateOfBirth;

    private String gender;

    private String bio;

    private String phoneNumber;

    private String address;

    private String relationshipStatus;

    private String job;

    private String education;

    private LocalDateTime timestamp;

    private List<PostModel> posts;

    private List<LikeModel> likes;

    private List<MessageModel> sentMessages;

    private List<MessageModel> receivedMessages;

    private List<FriendshipModel> friendships1;

    private List<FriendshipModel> friendships2;

    private List<EventParticipantModel> eventParticipants;

    private List<CommentModel> comments;

    private MultipartFile avatarFile;

    private Boolean isEdit = false;
}
