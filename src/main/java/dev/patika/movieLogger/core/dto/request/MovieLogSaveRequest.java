package dev.patika.movieLogger.core.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieLogSaveRequest {

    @NotNull(message = "User ID cannot be null")
    private Long userId;

    @NotNull(message = "Movie ID cannot be null")
    private Long movieId;

    @NotNull(message = "Watch date cannot be null")
    private LocalDate watchedAt;

    @Min(value = 0, message = "Rating must be between 0 and 10")
    @Max(value = 10, message = "Rating must be between 0 and 10")
    private Double rating;

    private String review;

    private Boolean liked;
    private Boolean isFavorite;
    private Boolean firstTimeWatched;

}

