package dev.patika.movieLogger.core.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieClubCommentSaveRequest {

    @NotNull(message = "User ID cannot be null")
    private Long userId;

    @NotNull(message = "Movie club ID cannot be null")
    private Long movieClubId;

    private Long parentCommentId; // Opsiyonel: Yanıt değilse null

    @NotBlank(message = "Comment content cannot be blank")
    private String content;
}
