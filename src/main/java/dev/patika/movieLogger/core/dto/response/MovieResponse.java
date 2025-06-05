package dev.patika.movieLogger.core.dto.response;
import dev.patika.movieLogger.core.dto.summary.PersonSummaryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieResponse {

    private Long id;
    private String title;
    private String synopsis;
    private LocalDate releaseDate;
    private Integer durationInMinutes;

    private Set<PersonSummaryResponse> cast;
    private Set<PersonSummaryResponse> crew;

    private Set<String> genres;
    private Set<String> services;

    private Double ratingAverage;
    private Integer movieLogCount;
    private Integer watchlistedByCount;

} 