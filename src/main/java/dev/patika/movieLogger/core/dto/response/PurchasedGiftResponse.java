package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.UserSummaryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchasedGiftResponse {

    private Long id;

    private GiftResponse gift;

    private UserSummaryResponse user;

    private Integer quantity;

    private LocalDateTime purchaseDate;
}

