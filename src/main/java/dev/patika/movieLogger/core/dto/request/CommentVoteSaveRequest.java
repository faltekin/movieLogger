package dev.patika.movieLogger.core.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentVoteSaveRequest {

    @NotNull(message = "User ID cannot be null")
    private Long userId;

    @NotNull(message = "Comment ID cannot be null")
    private Long commentId;

    @NotNull(message = "Vote type cannot be null")
    private Boolean isUpvote; // true = upvote, false = downvote
}

