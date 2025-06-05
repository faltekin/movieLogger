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
public class WatchlistResponse {

    private Long id;

    private UserSummaryResponse user;

    private MovieSummaryResponse movie;

    private LocalDateTime addedAt;

}

