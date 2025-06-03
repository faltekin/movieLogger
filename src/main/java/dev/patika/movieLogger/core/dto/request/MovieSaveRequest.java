package dev.patika.movieLogger.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieSaveRequest {

    @NotBlank(message = "Movie title cannot be empty")
    private String title;

    @NotBlank(message = "Movie description cannot be empty")
    private String description;

    @NotNull(message = "Release date cannot be null")
    private LocalDate releaseDate;

    @Positive(message = "Duration must be positive")
    private Integer durationInMinutes;

    @NotBlank(message = "Genre cannot be empty")
    private String genre;

    @NotBlank(message = "Director cannot be empty")
    private String director;

    private String posterUrl;
} 