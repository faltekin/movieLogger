package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.UserSummaryResponse;
import dev.patika.movieLogger.core.dto.summary.MovieSummaryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentResponse {

    private Long id;

    private UserSummaryResponse user;

    private MovieSummaryResponse movie;

    private String content;

    private List<CommentResponse> replies;

    private Boolean isFromVerifiedCast;
    private Boolean isFromVerifiedCrew;

    private Integer giftCount;
    private Integer voteScore;
    private Integer reportCount;

    private Long parentId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

