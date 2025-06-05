package dev.patika.movieLogger.core.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieClubSaveRequest {

    @NotBlank(message = "Club name cannot be empty")
    private String name;

    @NotBlank(message = "Description cannot be empty")
    private String description;

    @NotNull(message = "Owner user ID is required")
    private Long ownerId;

    @NotNull(message = "Current movie ID is required")
    private Long currentMovieId;

    private boolean isPrivate = true;
}

