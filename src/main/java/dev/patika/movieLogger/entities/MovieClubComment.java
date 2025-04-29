package dev.patika.movieLogger.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movie_clubs_comments")
public class MovieClubComment extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "movie_clubs_comments_user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "movie_clubs_comments_movie_club", nullable = false)
    private MovieClub movieClub;

    @ManyToOne
    @JoinColumn(name = "movie_clubs_comments_parent_comment_id", nullable = false)
    private MovieClubComment parentComment;

    @OneToMany(mappedBy = "parentComment", cascade = CascadeType.ALL)
    private List<MovieClubComment> replies = new ArrayList<>();

    @Column(name = "movie_clubs_comments_content",nullable = false)
    private String content;

    @Column(name = "movie_clubs_comments_upvote_count",nullable = false)
    private Integer upvoteCount;

    @Column(name = "movie_clubs_comments_downvote_count",nullable = false)
    private Integer downvoteCount;
}

