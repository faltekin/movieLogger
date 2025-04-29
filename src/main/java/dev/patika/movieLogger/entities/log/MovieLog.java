package dev.patika.movieLogger.entities.log;

import dev.patika.movieLogger.entities.BaseEntity;
import dev.patika.movieLogger.entities.Movie;
import dev.patika.movieLogger.entities.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movie_logs")
public class MovieLog extends BaseEntity {

    @Column(name = "movie_log_rating",nullable = false)
    private Integer rating;

    @Column(name = "movie_log_review")
    private String review;

    @Column(name = "movie_log_watched_at",nullable = false)
    private LocalDateTime watchedAt;

    @Column(name = "movie_log_like")
    private Boolean liked = false;

    @Column(name = "movie_log_favorite")
    private Boolean isFavorite = false;

    @Column(name = "movie_log_first_time_watched")
    private Boolean firstTimeWatched = true;

    @ManyToOne
    @JoinColumn(name = "movie_log_user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "movie_log_movie_id", nullable = false)
    private Movie movie;



}
