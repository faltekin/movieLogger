package dev.patika.movieLogger.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "watchlists")
public class Watchlist extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "watchlist_user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "watchlist_movie_id", nullable = false)
    private Movie movie;

}

