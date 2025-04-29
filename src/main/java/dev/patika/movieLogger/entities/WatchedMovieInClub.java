package dev.patika.movieLogger.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "watched_movies_in_club")
public class WatchedMovieInClub extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "watched_movies_in_club_user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "watched_movies_in_club_movie", nullable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "watched_movies_in_club_movie_club", nullable = false)
    private MovieClub movieClub;
}

