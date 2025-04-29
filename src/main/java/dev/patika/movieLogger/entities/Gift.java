package dev.patika.movieLogger.entities;

import dev.patika.movieLogger.entities.enums.GiftRarity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "gifts")
public class Gift extends BaseEntity {

    @Column(name = "gifts_name",nullable = false)
    private String name;

    @Column(name = "gifts_description",nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "gifts_rarity",nullable = false)
    private GiftRarity rarity;

    @Column(name = "gifts_price",nullable = false)
    private Double price;

    @Column(name = "gifts_stock",nullable = false)
    private Integer stock;

    @Column(name = "gifts_image_url",nullable = false)
    private String imageUrl;

    @Column(name = "gifts_available_until",nullable = false)
    private LocalDateTime availableUntil;

    @Column(name = "gifts_is_available",nullable = false)
    private Boolean isAvailable = true;

    @Column(name = "gifts_boost_value",nullable = false)
    private Integer boostValue;

    @OneToMany(mappedBy = "gift", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PurchasedGift> purchasedByUsers = new ArrayList<>();

    @OneToMany(mappedBy = "gift", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OwnedGift> ownedByUsers = new ArrayList<>();
}

