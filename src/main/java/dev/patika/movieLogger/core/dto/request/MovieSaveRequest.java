package dev.patika.movieLogger.core.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieSaveRequest {

    @NotBlank(message = "Movie title cannot be empty")
    private String title;

    @NotNull(message = "Release date cannot be null")
    private Integer releaseDate;

    @NotBlank(message = "Movie synopsis cannot be empty")
    private String synopsis;

    @Positive(message = "Duration must be positive")
    private Integer durationInMinutes;

    @NotEmpty
    private Set<Long> castIds;
    @NotEmpty
    private Set<Long> crewIds;
    @NotEmpty
    private Set<Long> genreIds;
    @NotEmpty
    private Set<Long> serviceIds;

} 