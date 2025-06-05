package dev.patika.movieLogger.core.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FollowSaveRequest {

    @NotNull(message = "Follower user ID cannot be null")
    private Long followerId;

    @NotNull(message = "Followed user ID cannot be null")
    private Long followedId;
}

