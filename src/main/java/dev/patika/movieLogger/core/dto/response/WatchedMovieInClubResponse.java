package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.UserSummaryResponse;
import dev.patika.movieLogger.core.dto.summary.MovieSummaryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WatchedMovieInClubResponse {

    private Long id;

    private UserSummaryResponse user;

    private MovieSummaryResponse movie;

    private Long movieClubId;

    private LocalDateTime createdAt;
}
