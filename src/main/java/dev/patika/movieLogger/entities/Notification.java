package dev.patika.movieLogger.entities;

import dev.patika.movieLogger.entities.enums.NotificationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "notifications")
public class Notification extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "notifications_receiver_id", nullable = false)
    private User receiver;

    @Column(name = "notifications_title",nullable = false)
    private String title;

    @Column(name = "notifications_message",nullable = false)
    private String message;

    @Column(name = "notifications_is_read",nullable = false)
    private boolean isRead = false;

    @Enumerated(EnumType.STRING)
    @Column(name = "notifications_type",nullable = false)
    private NotificationType type; // COMMENT, GIFT_RECEIVED, FRIEND_REQUEST vs.

    @Column(name = "notifications_related_entity_id",nullable = false)
    private Long relatedEntityId; // örneğin commentId, movieLogId vs.
}
