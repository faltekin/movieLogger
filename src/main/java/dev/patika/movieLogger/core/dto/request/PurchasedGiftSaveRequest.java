package dev.patika.movieLogger.core.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchasedGiftSaveRequest {

    @NotNull(message = "Gift ID cannot be null")
    private Long giftId;

    @NotNull(message = "User ID cannot be null")
    private Long userId;

    @NotNull(message = "Quantity is required")
    @Min(value = 1, message = "At least one gift must be purchased")
    private Integer quantity;
}

