package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.UserSummaryResponse;
import dev.patika.movieLogger.entities.enums.ActionType;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventLogResponse {

    private Long id;

    private UserSummaryResponse user;

    private ActionType actionType;

    private String details;

    private LocalDateTime eventTime;
}
