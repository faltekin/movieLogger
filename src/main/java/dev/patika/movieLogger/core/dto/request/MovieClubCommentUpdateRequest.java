package dev.patika.movieLogger.core.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieClubCommentUpdateRequest {

    @NotNull(message = "Comment ID cannot be null")
    private Long id;

    @NotBlank(message = "Updated content cannot be blank")
    private String content;
}

