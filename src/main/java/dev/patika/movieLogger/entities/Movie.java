package dev.patika.movieLogger.entities;

import dev.patika.movieLogger.entities.log.MovieLog;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movies")
public class Movie extends BaseEntity{

    @Column(name="movies_name",nullable = false)
    private String title;

    @Column(name="movies_release_year",nullable = false)
    private Integer releaseYear;

    @ManyToMany
    @JoinTable(name = "movie_cast",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id"))
    private Set<Person> cast = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "movie_crew",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id"))
    private Set<Person> crew = new HashSet<>();

    @Column(name="movies_synopsis",length = 1000)
    private String synopsis;

    @ManyToMany
    @JoinTable(name = "movie_genres",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private Set<Genre> genres = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "movie_services",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id"))
    private Set<StreamingService> services = new HashSet<>();

    @Column(name="movies_rating_average",nullable = false)
    private Double ratingAverage;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<MovieLog> movieLogs = new ArrayList<>();

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<VerifiedUser> verifiedUsers = new ArrayList<>();

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Watchlist> watchlistedBy = new ArrayList<>();


}

