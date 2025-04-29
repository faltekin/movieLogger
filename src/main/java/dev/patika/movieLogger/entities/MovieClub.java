package dev.patika.movieLogger.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movie_clubs")
public class MovieClub extends BaseEntity {

    @Column(name = "movie_clubs_name",nullable = false)
    private String name;

    @Column(name = "movie_clubs_description",nullable = false)
    private String description;

    @Column(name = "movie_clubs_is_private",nullable = false)
    private boolean isPrivate = true;

    @ManyToOne
    @JoinColumn(name = "movie_clubs_owner_id", nullable = false)
    private User owner;

    @ManyToMany
    private List<User> members = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "movie_clubs_current_movie", nullable = false)
    private Movie currentMovie;

    @OneToMany(mappedBy = "movieClub", cascade = CascadeType.ALL)
    private List<MovieClubComment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "movieClub", cascade = CascadeType.ALL)
    private List<WatchedMovieInClub> watchedMovies = new ArrayList<>();
}

