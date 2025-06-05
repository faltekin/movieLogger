package dev.patika.movieLogger.core.dto.request;

import dev.patika.movieLogger.entities.enums.VerifiedRole;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerifiedUserSaveRequest {

    @NotNull(message = "User ID cannot be null")
    private Long userId;

    @NotNull(message = "Movie ID cannot be null")
    private Long movieId;

    @NotNull(message = "Verified role must be provided")
    private VerifiedRole role;

}

