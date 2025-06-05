package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.UserSummaryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportResponse {

    private Long id;

    private UserSummaryResponse reporter;

    private UserSummaryResponse reportedUser;

    private Long commentId; // İstersen CommentSummaryResponse olarak da tanımlayabilirsin

    private String reason;

    private String status; // ReportStatus enum

    private LocalDateTime createdAt;
}

