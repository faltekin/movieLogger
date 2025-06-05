package dev.patika.movieLogger.core.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WatchlistSaveRequest {

    @NotNull(message = "User ID cannot be null")
    private Long userId;

    @NotNull(message = "Movie ID cannot be null")
    private Long movieId;

}

