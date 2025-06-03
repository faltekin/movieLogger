package dev.patika.movieLogger.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieResponse {

    private Long id;
    private String title;
    private String description;
    private LocalDate releaseDate;
    private Integer durationInMinutes;
    private String genre;
    private String director;
    private String posterUrl;
    private LocalDate createdAt;
    private LocalDate updatedAt;
} 