package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.UserSummaryResponse;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieClubCommentResponse {

    private Long id;

    private UserSummaryResponse user;

    private Long movieClubId;

    private Long parentCommentId; // null olabilir

    private String content;

    private Integer upvoteCount;
    private Integer downvoteCount;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private List<MovieClubCommentResponse> replies;
}

