package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.UserSummaryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FollowResponse {

    private Long id;

    private UserSummaryResponse follower;

    private UserSummaryResponse followed;

    private LocalDateTime createdAt;
}

