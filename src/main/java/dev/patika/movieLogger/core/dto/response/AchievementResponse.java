package dev.patika.movieLogger.core.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AchievementResponse {

    private Long id;
    private String title;
    private String description;
    private String iconUrl;
}
