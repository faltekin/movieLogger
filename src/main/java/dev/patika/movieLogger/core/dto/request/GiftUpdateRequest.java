package dev.patika.movieLogger.core.dto.request;

import dev.patika.movieLogger.entities.enums.GiftRarity;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GiftUpdateRequest {

    @NotNull(message = "Gift ID is required")
    private Long id;

    @NotBlank(message = "Gift name cannot be blank")
    private String name;

    @NotBlank(message = "Gift description cannot be blank")
    private String description;

    @NotNull(message = "Rarity is required")
    private GiftRarity rarity;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be positive")
    private Double price;

    @NotNull(message = "Stock is required")
    @Min(value = 0, message = "Stock cannot be negative")
    private Integer stock;

    @NotBlank(message = "Image URL is required")
    private String imageUrl;

    @NotNull(message = "Available until is required")
    private LocalDateTime availableUntil;

    private Boolean isAvailable = true;

    @NotNull(message = "Boost value is required")
    @Min(value = 1, message = "Boost value must be at least 1")
    private Integer boostValue;
}

