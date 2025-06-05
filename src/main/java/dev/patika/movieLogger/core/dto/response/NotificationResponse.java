package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.UserSummaryResponse;
import dev.patika.movieLogger.entities.enums.NotificationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationResponse {

    private Long id;

    private String title;

    private String message;

    private boolean isRead;

    private NotificationType type;

    private Long relatedEntityId;

    private UserSummaryResponse receiver;

    private LocalDateTime createdAt;
}

