package dev.patika.movieLogger.entities;

import dev.patika.movieLogger.entities.enums.ReportStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reports")
public class Report extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "reports_reporter_user_id", nullable = false)
    private User reporter;

    @ManyToOne
    @JoinColumn(name = "reports_reported_user_id", nullable = false)
    private User reportedUser;

    @ManyToOne
    @JoinColumn(name = "reports_reporterted_comment_id", nullable = false)
    private Comment reportedComment;

    @JoinColumn(name = "reports_reason", nullable = false)
    private String reason;

    @Enumerated(EnumType.STRING)
    @Column(name = "reports_status",nullable = false)
    private ReportStatus status; // PENDING, REVIEWED, ACTION_TAKEN
}

