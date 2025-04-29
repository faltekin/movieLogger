package dev.patika.movieLogger.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
public class Person extends BaseEntity {

    @Column(name = "persons_name",nullable = false)
    private String name;

    @Column(name = "persons_biography",nullable = false)
    private String biography;

    @Column(name = "persons_birth_date",nullable = false)
    private LocalDate birthDate;

    @OneToOne
    @JoinColumn(name = "persons_user_id")
    private User user;

    @ManyToMany(mappedBy = "cast")
    @JoinColumn(name = "persons_acted_movies", nullable = false)
    private Set<Movie> actedMovies = new HashSet<>();

    @ManyToMany(mappedBy = "crew")
    @JoinColumn(name = "persons_crew_movies", nullable = false)
    private Set<Movie> crewMovies = new HashSet<>();
}

