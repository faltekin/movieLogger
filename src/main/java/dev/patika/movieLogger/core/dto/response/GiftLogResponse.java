package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.UserSummaryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GiftLogResponse {

    private Long id;

    private String giftName;

    private UserSummaryResponse giftedBy;

    private UserSummaryResponse giftedTo;

    private Long commentId;

    private Double creditUsed;

    private Integer boostValue;

    private LocalDateTime createdAt;
}

