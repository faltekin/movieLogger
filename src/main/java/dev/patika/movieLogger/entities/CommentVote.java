package dev.patika.movieLogger.entities;

import dev.patika.movieLogger.entities.enums.VoteType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comments_votes")
public class CommentVote extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "comments_votes_user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "comments_votes_comment_id", nullable = false)
    private Comment comment;

    @Enumerated(EnumType.STRING)
    @Column(name = "comments_votes_vote_type",nullable = false)
    private VoteType voteType; // UPVOTE, DOWNVOTE

}

