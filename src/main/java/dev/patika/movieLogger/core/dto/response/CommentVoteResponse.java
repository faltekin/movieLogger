package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.UserSummaryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentVoteResponse {

    private Long id;

    private Long commentId;

    private UserSummaryResponse user;

    private Boolean isUpvote;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

