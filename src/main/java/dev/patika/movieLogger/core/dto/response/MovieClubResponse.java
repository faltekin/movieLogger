package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.MovieSummaryResponse;
import dev.patika.movieLogger.core.dto.summary.UserSummaryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieClubResponse {

    private Long id;

    private String name;

    private String description;

    private boolean isPrivate;

    private UserSummaryResponse owner;

    private MovieSummaryResponse currentMovie;

    private Integer memberCount;

    private Integer commentCount;

    private Integer watchedMovieCount;

    private LocalDateTime createdAt;
}

