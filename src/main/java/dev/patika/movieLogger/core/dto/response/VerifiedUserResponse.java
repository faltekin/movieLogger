package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.MovieSummaryResponse;
import dev.patika.movieLogger.core.dto.summary.UserSummaryResponse;
import dev.patika.movieLogger.entities.enums.VerifiedRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerifiedUserResponse {

    private Long id;

    private UserSummaryResponse user;

    private MovieSummaryResponse movie;

    private VerifiedRole role;

}

