package dev.patika.movieLogger.core.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentVoteUpdateRequest {

    @NotNull(message = "Vote ID cannot be null")
    private Long id;

    @NotNull(message = "Vote type cannot be null")
    private Boolean isUpvote;
}

