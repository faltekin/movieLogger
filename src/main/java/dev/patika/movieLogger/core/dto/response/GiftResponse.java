package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.entities.enums.GiftRarity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GiftResponse {

    private Long id;

    private String name;

    private String description;

    private GiftRarity rarity;

    private Double price;

    private Integer stock;

    private String imageUrl;

    private LocalDateTime availableUntil;

    private Boolean isAvailable;

    private Integer boostValue;
}

