package hcmute.model;

import java.time.LocalDateTime;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FriendshipModel {
	private Long friendshipId;

    private UserModel user1;

    private UserModel user2;

    private String status;

    private LocalDateTime timestamp;

    private Boolean isEdit = false;
}
