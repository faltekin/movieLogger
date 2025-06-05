package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.UserSummaryResponse;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AchievementLogResponse {

    private Long id;

    private UserSummaryResponse user;

    private AchievementResponse achievement;

    private LocalDateTime earnedAt;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
