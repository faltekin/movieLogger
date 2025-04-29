package dev.patika.movieLogger.entities.log;

import dev.patika.movieLogger.entities.Achievement;
import dev.patika.movieLogger.entities.BaseEntity;
import dev.patika.movieLogger.entities.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "log_achievements")
public class AchievementLog extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "log_achievements_user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "log_achievements_achievement_id", nullable = false)
    private Achievement achievement;

    @Column(name = "log_achievements_earned_at", nullable = false, updatable = false)
    private LocalDateTime earnedAt;

    @PrePersist
    protected void onEarned() {
        this.earnedAt = LocalDateTime.now();
    }
}
