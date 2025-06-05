package dev.patika.movieLogger.core.dto.response;

import dev.patika.movieLogger.core.dto.summary.MovieSummaryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonResponse {

    private Long id;
    private Long userId;
    private String username;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String biography;

    private Integer watchlistCount;

    private List<MovieSummaryResponse> actedMovies;
    private List<MovieSummaryResponse> crewMovies;



} 