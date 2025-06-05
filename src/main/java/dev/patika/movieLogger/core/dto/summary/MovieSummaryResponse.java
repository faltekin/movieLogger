package dev.patika.movieLogger.core.dto.summary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieSummaryResponse {
    private Long id;
    private String title;
    private Integer releaseYear;
}

