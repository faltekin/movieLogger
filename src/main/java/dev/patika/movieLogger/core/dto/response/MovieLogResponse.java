package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.MovieSummaryResponse;
import dev.patika.movieLogger.core.dto.summary.UserSummaryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieLogResponse {

    private Long id;

    private MovieSummaryResponse movie;

    private UserSummaryResponse user;

    private LocalDate watchedAt;

    private Double rating;

    private String review;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private Boolean liked;
    private Boolean isFavorite;
    private Boolean firstTimeWatched;

}

