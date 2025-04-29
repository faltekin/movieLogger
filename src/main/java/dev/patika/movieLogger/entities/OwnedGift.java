package dev.patika.movieLogger.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "owned_gifts")
public class OwnedGift extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "owned_gifts_user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "owned_gifts_gift_id", nullable = false)
    private Gift gift;

    @Column(name = "owned_gifts_quantity",nullable = false)
    private Integer quantity;
}
