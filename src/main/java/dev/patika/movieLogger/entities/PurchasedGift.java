package dev.patika.movieLogger.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "purchased_gifts")
public class PurchasedGift extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "purchased_gifts_user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "purchased_gifts_gift_id", nullable = false)
    private Gift gift;

    @Column(name = "purchased_gifts_quantity",nullable = false)
    private Integer quantity;
}
