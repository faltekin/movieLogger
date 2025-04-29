package dev.patika.movieLogger.entities.log;

import dev.patika.movieLogger.entities.BaseEntity;
import dev.patika.movieLogger.entities.Comment;
import dev.patika.movieLogger.entities.Gift;
import dev.patika.movieLogger.entities.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "gift_logs")
public class GiftLog extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "gift_log_gift_id", nullable = false)
    private Gift gift;

    @ManyToOne
    @JoinColumn(name = "gift_log_gifted_by_id", nullable = false)
    private User giftedBy;

    @ManyToOne
    @JoinColumn(name = "gift_log_gifted_to_id", nullable = false)
    private User giftedTo;

    @ManyToOne
    @JoinColumn(name = "gift_log_comment_id", nullable = false)
    private Comment comment;

    @Column(name = "gift_log_credit_used", nullable = false)
    private Double creditUsed;

    @Column(name = "gift_log_boost_value", nullable = false)
    private Integer boostValue;

}

