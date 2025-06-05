package dev.patika.movieLogger.core.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GiftLogSaveRequest {

    @NotNull(message = "Gift ID cannot be null")
    private Long giftId;

    @NotNull(message = "Sender user ID cannot be null")
    private Long giftedById;

    @NotNull(message = "Receiver user ID cannot be null")
    private Long giftedToId;

    @NotNull(message = "Comment ID cannot be null")
    private Long commentId;

    @NotNull(message = "Credit used cannot be null")
    @Positive(message = "Credit used must be a positive number")
    private Double creditUsed;

    @NotNull(message = "Boost value must be provided")
    @PositiveOrZero(message = "Boost value must be zero or greater")
    private Integer boostValue;
}
