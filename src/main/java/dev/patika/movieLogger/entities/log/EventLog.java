package dev.patika.movieLogger.entities.log;

import dev.patika.movieLogger.entities.User;
import dev.patika.movieLogger.entities.enums.ActionType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "event_logs")
public class EventLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_logs_event_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "event_logs_action_type")
    private ActionType actionType;

    @Column(name = "event_logs_details", columnDefinition = "TEXT")
    private String details;

    @Column(name = "event_logs_event_time",updatable = false)
    private LocalDateTime eventTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_logs_user_id", nullable = false)
    private User user;

    @PrePersist
    protected void onCreate() {
        this.eventTime = LocalDateTime.now();
    }


}
